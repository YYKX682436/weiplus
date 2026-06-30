package dv2;

/* loaded from: classes10.dex */
public final class m0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f243891d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f243892e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f243893f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243894g;

    /* renamed from: h, reason: collision with root package name */
    public int f243895h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f243896i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f243897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243891d = jz5.h.b(new dv2.e0(this));
        this.f243892e = jz5.h.b(new dv2.k0(this));
        this.f243893f = jz5.h.b(new dv2.i0(this));
        this.f243894g = jz5.h.b(dv2.j0.f243873d);
        this.f243896i = "";
    }

    public static final void O6(dv2.m0 m0Var, java.lang.Object obj) {
        m0Var.getClass();
        if (obj instanceof org.json.JSONObject) {
            try {
                int optInt = ((org.json.JSONObject) obj).optInt("warnFlag");
                java.lang.String optString = ((org.json.JSONObject) obj).optString("warningWording");
                m0Var.f243895h = ((org.json.JSONObject) obj).optInt("tagType");
                java.lang.String optString2 = ((org.json.JSONObject) obj).optString("tagSecKey");
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                m0Var.f243896i = optString2;
                com.tencent.mars.xlog.Log.i("FinderPostAddTagUIC", "[finishSetWarningWording] warnFlag:" + optInt + " warningWording:" + optString + " tagType:" + m0Var.f243895h + " tagSecKey:" + m0Var.f243896i);
                boolean z17 = !r26.n0.N(m0Var.f243896i);
                jz5.g gVar = m0Var.f243892e;
                if (z17) {
                    ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(optString);
                } else {
                    ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(m0Var.R6());
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("FinderPostAddTagUIC", java.lang.String.valueOf(e17.getMessage()));
            }
        }
    }

    public final m92.b P6() {
        return g92.a.j3(g92.b.f269769e, xy2.c.e(getActivity()), false, 2, null);
    }

    public final java.util.Map Q6() {
        java.lang.String postId;
        java.util.Map l17 = kz5.c1.l(new jz5.l("tag_type", java.lang.Integer.valueOf(this.f243895h)));
        if (this.f243896i.length() > 0) {
            l17.put("tag_sec_key", this.f243896i);
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null) {
            l17.put("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject.getEnterScene()));
        }
        if (finderFeedReportObject != null && (postId = finderFeedReportObject.getPostId()) != null) {
            l17.put("post_id", postId);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jz5.g gVar = this.f243893f;
        sr2.y2 y2Var = (sr2.y2) ((jz5.n) gVar).getValue();
        dv2.f0 f0Var = new dv2.f0(jSONObject);
        y2Var.getClass();
        f0Var.invoke(y2Var.f411817x, y2Var.f411818y);
        java.lang.String str = ((sr2.y2) ((jz5.n) gVar).getValue()).f411812s;
        if (str != null) {
            jSONObject.put("assetTime", java.lang.String.valueOf(java.lang.Long.parseLong(str) / 1000));
        }
        l17.put("poi_info", jSONObject);
        return l17;
    }

    public final java.lang.String R6() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.String wording;
        m92.b P6 = P6();
        java.lang.String str = null;
        r45.nc4 u07 = P6 != null ? P6.u0() : null;
        if (u07 != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) u07.getCustom(43)) != null && (wording = finderJumpInfo.getWording()) != null && (!r26.n0.N(wording))) {
            str = wording;
        }
        return str == null ? getString(com.tencent.mm.R.string.f493752ox2) : str;
    }

    public final com.tencent.mm.plugin.finder.post.PostMainUIC S6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.post.PostMainUIC) a17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        jz5.g gVar;
        int intExtra = getIntent().getIntExtra("KEY_ACTION_TYPE", 0);
        m92.b P6 = P6();
        r45.nc4 u07 = P6 != null ? P6.u0() : null;
        int integer = u07 != null ? u07.getInteger(42) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isShowDeclareTagEntry] declareTagEntry:");
        sb6.append(integer);
        sb6.append(", tagEntry is null:");
        sb6.append((u07 != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) u07.getCustom(43) : null) == null);
        com.tencent.mars.xlog.Log.i("FinderAccountExt", sb6.toString());
        if (integer != 0) {
            if ((u07 != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) u07.getCustom(43) : null) != null) {
                z17 = true;
                gVar = this.f243891d;
                if (z17 || intExtra == 1) {
                    android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
                kotlin.jvm.internal.o.f(view2, "<get-addTagView>(...)");
                hc2.p0.d(view2, "post_annotation_prompt", "view_exp", null, 4, null);
                android.view.View view3 = (android.view.View) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new dv2.h0(this));
                return;
            }
        }
        z17 = false;
        gVar = this.f243891d;
        if (z17) {
        }
        android.view.View view4 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        ((android.widget.TextView) ((jz5.n) this.f243892e).getValue()).setText(R6());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f243891d = jz5.h.b(new dv2.e0(this));
        this.f243892e = jz5.h.b(new dv2.k0(this));
        this.f243893f = jz5.h.b(new dv2.i0(this));
        this.f243894g = jz5.h.b(dv2.j0.f243873d);
        this.f243896i = "";
    }
}
