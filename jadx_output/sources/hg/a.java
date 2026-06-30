package hg;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.plugin.appbrand.widget.input.u5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg.h f281275a;

    public a(hg.h hVar) {
        this.f281275a = hVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public void a(boolean z17) {
        ((hg.c) this.f281275a.f281310n).a(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public int b() {
        return this.f281275a.f281302f;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public void d(int i17) {
        ((hg.c) this.f281275a.f281310n).d(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public android.app.Activity getActivity() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public android.view.View getContentView() {
        hg.h hVar = this.f281275a;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = hVar.f281297a;
        if (oaVar == null || oaVar.a() == null || hVar.f281297a.a().getContentView() == null) {
            return null;
        }
        return hVar.f281297a.a().getContentView();
    }
}
