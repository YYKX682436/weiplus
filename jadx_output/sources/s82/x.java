package s82;

/* loaded from: classes9.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.z f404852d;

    public x(s82.z zVar) {
        this.f404852d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = fp.i.b();
        s82.z zVar = this.f404852d;
        if (!b17) {
            db5.t7.k(zVar.f404739c.f101384a, null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof o72.r2) {
            o72.r2 r2Var = (o72.r2) view.getTag();
            r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
            r45.gp0 J2 = o72.x1.J(r2Var);
            if (J2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavBaseListItem", "data item is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (o72.x1.k0(J2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "same song, do release");
                b21.m.j();
                s82.z.l(zVar, null);
            } else {
                if (!com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(view.getContext(), null)) {
                    yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                int E = o72.x1.E(r2Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "favTingType = " + E);
                if (!o72.x1.F() || E == o72.x1.f343521g) {
                    java.lang.String str = jq0Var.f378050w;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    o72.x1.u0(J2, str, bool, 1500, r2Var.field_id + "", java.lang.Boolean.FALSE, null, null);
                } else {
                    java.lang.String str2 = jq0Var.f378050w;
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    bw5.ar0 ar0Var2 = bw5.ar0.TingScene_UnDefined;
                    o72.x1.v0(J2, str2, bool2, 1500, r2Var.field_id + "", E);
                }
                s82.z.l(zVar, (android.widget.ImageView) view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
