package jm4;

/* loaded from: classes13.dex */
public class y extends com.tencent.unit_rc.BaseProxyObject implements jm4.x {
    public void a(com.tencent.unit_rc.ByteBuffer byteBuffer, bw5.y1 metaInfo, boolean z17) {
        kotlin.jvm.internal.o.g(metaInfo, "metaInfo");
        byte[] byteArray = metaInfo.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_0025.UR_9DD3.UR_AB8B(cppPointer, byteBuffer, byteArray, z17);
    }
}
