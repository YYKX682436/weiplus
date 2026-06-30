package nr2;

/* loaded from: classes2.dex */
public final class j0 extends com.tencent.mm.ui.component.UIComponent {
    public final yz5.a A;
    public final android.view.ViewOutlineProvider B;
    public final v92.g C;
    public final nr2.i0 D;

    /* renamed from: d, reason: collision with root package name */
    public nr2.m f339220d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f339221e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f339222f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f339223g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f339224h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f339225i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f339226m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f339227n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f339228o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f339229p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f339230q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f339231r;

    /* renamed from: s, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f339232s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f339233t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f339234u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f339235v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f339236w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f339237x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f339238y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f339239z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.A = new nr2.c0(this);
        this.B = new nr2.u();
        this.C = new nr2.t(this, getActivity());
        this.D = new nr2.i0(this, getActivity());
    }

    public static final java.util.Map O6(nr2.j0 j0Var) {
        android.app.Activity context = j0Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        int intExtra = j0Var.getIntent().getIntExtra("collection_ref_comment_scene", 0);
        if (V6 == null) {
            return null;
        }
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("finder_tab_context_id", V6.getString(2));
        lVarArr[1] = new jz5.l("finder_context_id", V6.getString(1));
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
        lVarArr[3] = new jz5.l("ref_commentscene", java.lang.Integer.valueOf(intExtra));
        nr2.m mVar = j0Var.f339220d;
        lVarArr[4] = new jz5.l("collection_id", pm0.v.u(mVar != null ? mVar.l() : 0L));
        return kz5.c1.k(lVarArr);
    }

    public static final r45.ev2 P6(nr2.j0 j0Var) {
        nr2.m mVar = j0Var.f339220d;
        if (mVar == null) {
            return null;
        }
        int i17 = 0;
        int intExtra = j0Var.getIntent().getIntExtra("collection_ref_comment_scene", 0);
        r45.ev2 ev2Var = new r45.ev2();
        ev2Var.set(0, java.lang.Long.valueOf(mVar.l()));
        ev2Var.set(1, mVar.k());
        ev2Var.set(2, mVar.e());
        ev2Var.set(3, mVar.c());
        ev2Var.set(4, java.lang.Integer.valueOf(mVar.f()));
        ev2Var.set(6, java.lang.Integer.valueOf(mVar.n()));
        ev2Var.set(7, java.lang.Integer.valueOf(mVar.i()));
        ev2Var.set(8, mVar.o());
        if (intExtra >= 0) {
            i17 = intExtra;
        } else {
            android.app.Activity context = j0Var.getContext();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
            if (mMFinderUI != null) {
                i17 = mMFinderUI.getD();
            }
        }
        ev2Var.set(13, java.lang.Integer.valueOf(i17));
        return ev2Var;
    }

    public final v92.g Q6() {
        r45.do2 do2Var;
        ya2.g gVar = ya2.h.f460484a;
        nr2.m mVar = this.f339220d;
        ya2.b2 b2Var = null;
        ya2.b2 b17 = gVar.b(mVar != null ? mVar.o() : null);
        boolean z17 = true;
        if (b17 == null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f339239z;
            if (finderContact != null) {
                java.lang.String username = finderContact.getUsername();
                if (username == null) {
                    username = "";
                }
                b2Var = ya2.d.g(finderContact, gVar.b(username), true);
            }
            b17 = b2Var;
        }
        nr2.m mVar2 = this.f339220d;
        boolean z18 = (((mVar2 == null || (do2Var = mVar2.f339268d) == null) ? 0 : do2Var.getInteger(3)) & 1) == 1;
        if (!((b17 == null || ya2.d.f(b17)) ? false : true) && !z18) {
            z17 = false;
        }
        return z17 ? this.D : this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x074c  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.j0.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.D.getClass();
        this.C.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.A = new nr2.c0(this);
        this.B = new nr2.u();
        this.C = new nr2.t(this, getActivity());
        this.D = new nr2.i0(this, getActivity());
    }
}
