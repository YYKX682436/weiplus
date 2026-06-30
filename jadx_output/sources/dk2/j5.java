package dk2;

/* loaded from: classes3.dex */
public final class j5 extends dk2.t4 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f233639b;

    /* renamed from: c, reason: collision with root package name */
    public r45.yh1 f233640c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f233641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f233639b = "FinderLiveComboRewardMsg";
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20013) {
            return null;
        }
        if (!this.f233641d) {
            r45.yh1 yh1Var = new r45.yh1();
            com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
            yh1Var.parseFrom(byteString != null ? byteString.g() : null);
            return yh1Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveComboRewardMsg is selfSend getPayLoadContent:");
        java.lang.Object obj = this.f233640c;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.tencent.mars.xlog.Log.i(this.f233639b, sb6.toString());
        return this.f233640c;
    }
}
