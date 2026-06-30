package hg;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.widget.input.k2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f281279d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg.h f281280e;

    public c(hg.h hVar) {
        this.f281280e = hVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        this.f281279d = z17;
        hg.h hVar = this.f281280e;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = hVar.f281297a;
        if (oaVar == null || oaVar.a() == null || hVar.f281297a.a().getContentView() == null || sf.c.f406939a.b()) {
            b(z17);
        } else {
            if (hVar.f281305i) {
                return;
            }
            hVar.f281305i = true;
            hVar.f281297a.a().getContentView().postDelayed(new java.lang.Runnable() { // from class: hg.c$$a
                @Override // java.lang.Runnable
                public final void run() {
                    hg.c cVar = hg.c.this;
                    hg.h hVar2 = cVar.f281280e;
                    if (hVar2.f281303g) {
                        cVar.b(cVar.f281279d);
                    }
                    hVar2.f281305i = false;
                }
            }, 250L);
        }
    }

    public final void b(final boolean z17) {
        hg.h hVar = this.f281280e;
        com.tencent.mm.plugin.appbrand.widget.input.u3 b17 = hVar.b();
        if (b17 != null) {
            android.widget.EditText editText = hVar.f281300d;
            if (editText != null) {
                if (z17) {
                    b17.f91691x = editText;
                } else {
                    b17.e(editText);
                }
            }
            b17.d(z17 ? hVar.f281302f : 0);
        }
        sf.c.f406939a.a(hVar.f281297a.a(), hVar.f281297a.b(), new sf.b(z17 ? hVar.f281302f : 0, hVar.c(hVar.f281302f), java.lang.Integer.valueOf(hVar.f281304h), new yz5.a() { // from class: hg.c$$c
            @Override // yz5.a
            public final java.lang.Object invoke() {
                hg.h hVar2 = hg.c.this.f281280e;
                boolean z18 = z17;
                hVar2.onKeyboardHeightChanged(z18, z18 ? hVar2.f281302f : 0, false);
                return null;
            }
        }));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(final int i17) {
        int i18;
        hg.h hVar = this.f281280e;
        boolean z17 = (i17 == 0 || (i18 = hVar.f281302f) == 0 || i17 == i18) ? false : true;
        hVar.f281302f = i17;
        if (z17) {
            sf.c.f406939a.a(hVar.f281297a.a(), hVar.f281297a.b(), new sf.b(i17, hVar.c(i17), java.lang.Integer.valueOf(hVar.f281304h), new yz5.a() { // from class: hg.c$$b
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    hg.c cVar = hg.c.this;
                    cVar.getClass();
                    int i19 = i17;
                    cVar.f281280e.onKeyboardHeightChanged(i19 > 0, i19, false);
                    return null;
                }
            }));
        }
        com.tencent.mm.plugin.appbrand.widget.input.u3 b17 = hVar.b();
        if (b17 != null) {
            b17.d(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public int getHeight() {
        return this.f281280e.f281302f;
    }
}
