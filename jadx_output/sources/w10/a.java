package w10;

/* loaded from: classes.dex */
public final class a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f441961d;

    public a(yz5.q qVar) {
        this.f441961d = qVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f441961d.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
    }
}
