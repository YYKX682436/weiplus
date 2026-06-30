package s82;

/* loaded from: classes9.dex */
public class z extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404858f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f404859g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f404860h;

    public z(com.tencent.mm.plugin.fav.ui.ra raVar) {
        super(raVar);
        this.f404860h = new s82.x(this);
        this.f404858f = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479775ew);
        this.f404859g = new java.util.HashSet();
    }

    public static void l(s82.z zVar, android.widget.ImageView imageView) {
        java.util.HashSet hashSet = (java.util.HashSet) zVar.f404859g;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "mask iv set size is %d", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) it.next();
            if (imageView2 == imageView) {
                imageView2.setImageResource(com.tencent.mm.R.drawable.as6);
            } else {
                imageView2.setImageResource(com.tencent.mm.R.drawable.as8);
            }
        }
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        return o72.x1.J(r2Var).f375408f;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.fav_type_music);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.y yVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            yVar = new s82.y();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(view2, yVar, r2Var);
            yVar.f404853q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dum);
            yVar.f404855s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dwp);
            yVar.f404856t = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f484314du0);
            yVar.f404854r = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.dur);
            ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dvy)).setVisibility(8);
            yVar.f404854r.setOnClickListener(this.f404860h);
            yVar.f404854r.setVisibility(0);
            ((java.util.HashSet) this.f404859g).add(yVar.f404854r);
        } else {
            try {
                view2 = view;
                yVar = (s82.y) view.getTag();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavBaseListItem", "invalid type, message:" + e17.getMessage());
                return view;
            }
        }
        g(yVar, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        yVar.f404855s.setText(J2.f375404d);
        s82.c.h(yVar.f404853q, 7);
        yVar.f404856t.setVisibility(0);
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
        android.widget.ImageView imageView = yVar.f404853q;
        int i17 = this.f404858f;
        raVar.c(imageView, J2, r2Var, com.tencent.mm.R.raw.music_default, i17, i17);
        yVar.f404854r.setTag(r2Var);
        if (o72.x1.k0(J2)) {
            yVar.f404854r.setImageResource(com.tencent.mm.R.drawable.as6);
            yVar.f404854r.setContentDescription(context.getString(com.tencent.mm.R.string.f490511x5));
        } else {
            yVar.f404854r.setImageResource(com.tencent.mm.R.drawable.as8);
            yVar.f404854r.setContentDescription(context.getString(com.tencent.mm.R.string.f490519xf));
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        if (com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(view.getContext(), null)) {
            s82.y yVar = (s82.y) view.getTag();
            android.content.Context context = view.getContext();
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, yVar.f404774a, dq0Var);
        }
    }
}
