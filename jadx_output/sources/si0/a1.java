package si0;

/* loaded from: classes4.dex */
public final class a1 implements com.tencent.mm.plugin.sns.ui.lo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ si0.m1 f408036a;

    public a1(si0.m1 m1Var) {
        this.f408036a = m1Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.lo
    public void a(int i17, android.content.Intent intent) {
        this.f408036a.onActivityResult(17, i17, intent);
    }
}
