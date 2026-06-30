package sn1;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f410058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(byte[] bArr) {
        super(2);
        this.f410058d = bArr;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelbase.o rr6 = (com.tencent.mm.modelbase.o) obj;
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g((com.tencent.mm.modelbase.i) obj2, "<anonymous parameter 1>");
        rr6.f70714e = 1;
        boolean isSingleSession = rr6.isSingleSession();
        o45.zg reqObj = rr6.getReqObj();
        byte[] bArr = this.f410058d;
        reqObj.setPassKey(bArr);
        rr6.getReqObj().setReqPackControl(new sn1.m(reqObj, bArr, isSingleSession));
        return jz5.f0.f302826a;
    }
}
