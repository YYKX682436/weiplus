package dk2;

/* loaded from: classes3.dex */
public final class da extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20129) {
            return null;
        }
        bw5.uk ukVar = new bw5.uk();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        ukVar.parseFrom(byteString != null ? byteString.g() : null);
        return ukVar;
    }
}
