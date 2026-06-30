package com.tencent.paymars.mm;

/* loaded from: classes12.dex */
public class ConnectRecordSerializer {
    public static com.tencent.paymars.mm.ConnectRecord[] deserialize(byte[] bArr) {
        java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(bArr));
        com.tencent.paymars.mm.ConnectRecord[] connectRecordArr = (com.tencent.paymars.mm.ConnectRecord[]) objectInputStream.readObject();
        objectInputStream.close();
        return connectRecordArr;
    }

    public static byte[] serialize(com.tencent.paymars.mm.ConnectRecord[] connectRecordArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(connectRecordArr);
        objectOutputStream.flush();
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
