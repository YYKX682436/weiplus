package uf5;

/* loaded from: classes10.dex */
public class x1 extends uf5.w0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SnsTagDetailUI f427327s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.ui.contact.privacy.SnsTagDetailUI snsTagDetailUI, com.tencent.mm.ui.contact.l4 l4Var) {
        super(snsTagDetailUI, l4Var);
        this.f427327s = snsTagDetailUI;
    }

    @Override // uf5.w0
    public java.lang.String v() {
        long j17 = this.f427327s.G;
        if (j17 == 4) {
            return "@sns.black.android";
        }
        if (j17 == 5) {
            return "@sns.unlike.android";
        }
        return null;
    }
}
