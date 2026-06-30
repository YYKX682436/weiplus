package rj;

/* loaded from: classes10.dex */
public class l extends qk.o9 {

    /* renamed from: b, reason: collision with root package name */
    public ym5.h f396139b;

    /* renamed from: c, reason: collision with root package name */
    public qk.v7 f396140c;

    @Override // qk.o9
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPhotoEditorImpl", "cleanAllCache: ");
        com.tencent.mm.cache.ArtistCacheManager.a().b();
    }

    @Override // qk.o9
    public qk.v7 b() {
        if (this.f396140c == null) {
            this.f396140c = new f65.r(this.f396139b.getPresenter());
        }
        return this.f396140c;
    }

    @Override // qk.o9
    public qk.s c(android.content.Context context) {
        ym5.h hVar = this.f396139b;
        if (hVar == null) {
            qk.n9 n9Var = this.f364302a.f364231a;
            if (n9Var == qk.n9.VIDEO) {
                this.f396139b = new ym5.o6(context);
            } else if (n9Var == qk.n9.PHOTO) {
                this.f396139b = new ym5.x2(context);
            } else if (n9Var == qk.n9.SCREEN) {
                this.f396139b = new ym5.w2(context);
            } else if (n9Var == qk.n9.VIDEO_COVER) {
                this.f396139b = new ym5.n6(context);
            } else if (n9Var == qk.n9.LIVE_STICKER) {
                this.f396139b = new ym5.y5(context);
            } else if (n9Var == qk.n9.SNS_COVER) {
                this.f396139b = new ym5.m5(context);
            }
        } else if (hVar.getParent() != null) {
            ((android.view.ViewGroup) this.f396139b.getParent()).removeView(this.f396139b);
        }
        this.f396139b.setup(this.f364302a);
        return this.f396139b;
    }

    @Override // qk.o9
    public void d(qk.l9 l9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPhotoEditorImpl", "init: ");
        this.f364302a = l9Var;
        com.tencent.mm.cache.ArtistCacheManager a17 = com.tencent.mm.cache.ArtistCacheManager.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "[%s] makeCacheAlive: ", java.lang.Integer.valueOf(a17.hashCode()));
        a17.f63633b = true;
        com.tencent.mm.cache.ArtistCacheManager a18 = com.tencent.mm.cache.ArtistCacheManager.a();
        java.lang.String str = this.f364302a.f364234d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "MicroMsg.MMPhotoEditorImpl";
        }
        a18.f(str);
        um.f fVar = um.f.f428678c;
        java.lang.String str2 = this.f364302a.f364234d;
        fVar.b(str2 != null ? str2 : "MicroMsg.MMPhotoEditorImpl");
    }

    @Override // qk.o9
    public boolean e() {
        l45.n nVar = (l45.n) this.f396139b.getPresenter();
        if (nVar.f316460a.getTextEditView().getVisibility() == 0) {
            nVar.y(false);
            nVar.f316460a.setFooterVisible(true);
        } else {
            if (nVar.f316460a.getChatFooterPanel() == null || nVar.f316460a.getChatFooterPanel().getVisibility() != 0) {
                return false;
            }
            nVar.f316460a.c(true);
            nVar.f316460a.setFooterVisible(true);
        }
        return true;
    }

    @Override // qk.o9
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPhotoEditorImpl", "onDestroy: ");
        com.tencent.mm.cache.ArtistCacheManager.a().e();
        qk.l9 l9Var = this.f364302a;
        if (l9Var != null && !l9Var.f364232b) {
            com.tencent.mm.cache.ArtistCacheManager a17 = com.tencent.mm.cache.ArtistCacheManager.a();
            java.lang.String str = this.f364302a.f364234d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "MicroMsg.MMPhotoEditorImpl";
            }
            a17.g(str);
        }
        ym5.h hVar = this.f396139b;
        if (hVar != null) {
            ((l45.n) hVar.getPresenter()).p();
        }
        try {
            this.f396139b.getChatFooterPanel().a();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPhotoEditorImpl", "[onDestroy] may be has destory!");
        }
    }

    @Override // qk.o9
    public void g(qk.p7 p7Var, boolean z17) {
        l45.q presenter = this.f396139b.getPresenter();
        boolean z18 = !((f65.r) b()).g();
        l45.n nVar = (l45.n) presenter;
        nVar.getClass();
        s75.d.b(new l45.l(nVar, p7Var, z18, z17), "onFinalGenerate_" + p7Var.hashCode());
    }
}
