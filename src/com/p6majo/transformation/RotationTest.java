package com.p6majo.transformation;

import com.p6majo.linalg.Vector3D;

public class RotationTest {

    public void testGetQuaternion() {
        System.out.println(new Rotation(Vector3D.getUnitX(), 0));
        System.out.println(new Rotation(Vector3D.getUnitX().neg(), 0));

    }
}