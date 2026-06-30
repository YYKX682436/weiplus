package cw1;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI) {
        super(2);
        this.f223386d = cleanAllMessagesUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String from = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(from, "from");
        this.f223386d.f95653m = longValue;
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.v(this.f223386d, longValue));
        return jz5.f0.f302826a;
    }
}
