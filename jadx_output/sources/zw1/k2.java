package zw1;

/* loaded from: classes4.dex */
public class k2 extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public java.lang.String P;
    public java.lang.String Q;
    public final android.content.Context R;

    public k2(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.R = context;
        this.G = com.tencent.mm.R.layout.f488648zi;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.TextView) view.findViewById(android.R.id.title);
        this.N = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.c4q);
        android.widget.TextView textView = this.M;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = this.Q;
        float textSize = this.M.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this.R, str, textSize));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
            this.N.setVisibility(8);
            return;
        }
        this.N.setVisibility(0);
        gm0.j1.i();
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(this.P);
        if (f07 != null && ((int) f07.E2) > 0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.N, this.P, null);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((c01.k7) c01.n8.a()).b(this.P, 4, new zw1.j2(this, currentTimeMillis));
        }
    }

    public k2(android.content.Context context, int i17) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.R = context;
        this.G = i17;
    }
}
