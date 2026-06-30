package ll3;

/* loaded from: classes11.dex */
public class o1 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll3.r1 f319204a;

    public o1(ll3.r1 r1Var) {
        this.f319204a = r1Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(bVar.f359534d != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicImageLoader", "onImageLoadFinish %s %b", objArr);
        if (view == null) {
            return;
        }
        ql3.a aVar = (ql3.a) view.getTag();
        android.graphics.Bitmap bitmap = bVar.f359534d;
        if (bitmap == null || aVar == null) {
            return;
        }
        ll3.r1 r1Var = this.f319204a;
        r1Var.c(aVar, bitmap);
        ka0.k0 k0Var = r1Var.f319225c;
        if (k0Var != null) {
            android.graphics.Bitmap bitmap2 = bVar.f359534d;
            com.tencent.mm.plugin.mv.ui.shake.i iVar = (com.tencent.mm.plugin.mv.ui.shake.i) k0Var;
            um5.d dVar = iVar.f150946a;
            try {
                dVar.b(bitmap2);
                int i17 = iVar.f150947b;
                int i18 = iVar.f150948c;
                dVar.f429141b = i17;
                dVar.f429142c = i18;
                dVar.f429144e.f429193b.d();
                dVar.a(new com.tencent.mm.plugin.mv.ui.shake.h(iVar));
            } catch (java.lang.Exception unused) {
            }
        }
        int[] c17 = com.tencent.mm.ui.bk.c(bVar.f359534d, 4, 4);
        if (!(aVar.field_songBgColor == c17[0] && aVar.field_songLyricColor == c17[1])) {
            ll3.o2.Ai().L0(aVar.field_musicId, c17[0], c17[1]);
        }
        if (r1Var.f319224b != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new ll3.n1(this, aVar, c17));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
