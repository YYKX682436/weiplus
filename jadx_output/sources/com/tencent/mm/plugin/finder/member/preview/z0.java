package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class z0 extends eo2.j {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f121305e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f121306f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f121307g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f121308h;

    /* renamed from: i, reason: collision with root package name */
    public int f121309i;

    /* renamed from: m, reason: collision with root package name */
    public int f121310m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f121311n;

    /* renamed from: o, reason: collision with root package name */
    public long f121312o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f121313p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f121314q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f121315r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f121316s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f121317t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f121305e = jz5.h.b(new com.tencent.mm.plugin.finder.member.preview.x0(this));
        this.f121306f = jz5.h.b(new com.tencent.mm.plugin.finder.member.preview.y0(this));
        this.f121307g = "";
        this.f121308h = "";
        this.f121313p = "";
        this.f121317t = jz5.h.b(new com.tencent.mm.plugin.finder.member.preview.v0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b2w;
    }

    @Override // eo2.j, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.os.Bundle arguments;
        android.os.Bundle arguments2;
        android.os.Bundle arguments3;
        android.os.Bundle arguments4;
        android.os.Bundle arguments5;
        android.os.Bundle arguments6;
        android.os.Bundle arguments7;
        super.onCreate(bundle);
        androidx.fragment.app.Fragment fragment = getFragment();
        java.lang.String string = (fragment == null || (arguments7 = fragment.getArguments()) == null) ? null : arguments7.getString("key_author_finder_name");
        if (string == null) {
            string = "";
        }
        this.f121307g = string;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        java.lang.String string2 = (fragment2 == null || (arguments6 = fragment2.getArguments()) == null) ? null : arguments6.getString("key_finder_member_ticket");
        if (string2 == null) {
            string2 = "";
        }
        this.f121308h = string2;
        androidx.fragment.app.Fragment fragment3 = getFragment();
        this.f121309i = (fragment3 == null || (arguments5 = fragment3.getArguments()) == null) ? 0 : arguments5.getInt("key_finder_feed_count");
        androidx.fragment.app.Fragment fragment4 = getFragment();
        this.f121310m = (fragment4 == null || (arguments4 = fragment4.getArguments()) == null) ? 0 : arguments4.getInt("key_finder_member_feed_type");
        androidx.fragment.app.Fragment fragment5 = getFragment();
        this.f121312o = (fragment5 == null || (arguments3 = fragment5.getArguments()) == null) ? 0L : arguments3.getLong("key_member_topic_id");
        androidx.fragment.app.Fragment fragment6 = getFragment();
        java.lang.String string3 = (fragment6 == null || (arguments2 = fragment6.getArguments()) == null) ? null : arguments2.getString("key_member_collection_name");
        this.f121313p = string3 != null ? string3 : "";
        androidx.fragment.app.Fragment fragment7 = getFragment();
        byte[] byteArray = (fragment7 == null || (arguments = fragment7.getArguments()) == null) ? null : arguments.getByteArray("key_member_last_buffer");
        if (byteArray != null) {
            this.f121311n = new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length);
        }
        ((com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader) ((jz5.n) this.f121317t).getValue()).setLastBuffer(this.f121311n);
        jz5.g gVar = this.f121306f;
        com.tencent.mm.plugin.finder.member.preview.j0 j0Var = (com.tencent.mm.plugin.finder.member.preview.j0) ((jz5.n) gVar).getValue();
        jz5.g gVar2 = this.f121305e;
        j0Var.T((com.tencent.mm.plugin.finder.member.preview.i0) ((jz5.n) gVar2).getValue());
        ((com.tencent.mm.plugin.finder.member.preview.i0) ((jz5.n) gVar2).getValue()).m((com.tencent.mm.plugin.finder.member.preview.j0) ((jz5.n) gVar).getValue());
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jfn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f121315r = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f485884qg3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f121316s = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.jfo);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f121314q = findViewById3;
        android.widget.TextView textView = this.f121315r;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mediaCount");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.1f);
        int i17 = this.f121310m;
        if (i17 == 6) {
            android.widget.TextView textView2 = this.f121315r;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mediaCount");
                throw null;
            }
            textView2.setText(getContext().getString(com.tencent.mm.R.string.lrc));
        } else if (i17 != 7) {
            android.widget.TextView textView3 = this.f121315r;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("mediaCount");
                throw null;
            }
            textView3.setText(getContext().getString(com.tencent.mm.R.string.en7, java.lang.Integer.valueOf(this.f121309i)));
        } else {
            android.widget.TextView textView4 = this.f121315r;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("mediaCount");
                throw null;
            }
            textView4.setText(getContext().getString(com.tencent.mm.R.string.lrd));
            if (this.f121313p.length() > 0) {
                android.widget.TextView textView5 = this.f121316s;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("collectionNameTv");
                    throw null;
                }
                textView5.setVisibility(0);
                android.widget.TextView textView6 = this.f121316s;
                if (textView6 == null) {
                    kotlin.jvm.internal.o.o("collectionNameTv");
                    throw null;
                }
                textView6.setText(getContext().getString(com.tencent.mm.R.string.lre, this.f121313p));
            }
        }
        android.view.View view = this.f121314q;
        if (view == null) {
            kotlin.jvm.internal.o.o("payBtn");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.member.preview.w0(this));
        androidx.fragment.app.Fragment fragment8 = getFragment();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = fragment8 != null ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment8).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view2 = this.f121314q;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar).pk(view2, "become_member");
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view3 = this.f121314q;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar2).ik(view3, 40, 25496);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view4 = this.f121314q;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("payBtn");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[6];
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar = (eo2.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(eo2.b.class);
        lVarArr[0] = new jz5.l("member_zone_inlet_source", bVar != null ? java.lang.Integer.valueOf(bVar.f255558d) : null);
        lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr[2] = new jz5.l("finder_username", this.f121307g);
        lVarArr[3] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        lVarArr[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        ((cy1.a) rVar3).gk(view4, kz5.c1.k(lVarArr));
        if (this.f121310m == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getFragment(), iy1.c.FinderPreviewFeedListVideoUI);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getFragment(), iy1.c.FinderPreviewFeedListLiveUI);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(getFragment(), 12, 27010);
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        androidx.fragment.app.Fragment fragment9 = getFragment();
        jz5.l[] lVarArr2 = new jz5.l[6];
        lVarArr2[0] = new jz5.l("finder_username", this.f121307g);
        lVarArr2[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr2[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar2 = (eo2.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).e(eo2.b.class);
        lVarArr2[3] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar2 != null ? bVar2.f255558d : 0));
        lVarArr2[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr2[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        ((cy1.a) rVar4).gk(fragment9, kz5.c1.k(lVarArr2));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.plugin.finder.member.preview.i0) ((jz5.n) this.f121305e).getValue()).onDetach();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f121305e = jz5.h.b(new com.tencent.mm.plugin.finder.member.preview.x0(this));
        this.f121306f = jz5.h.b(new com.tencent.mm.plugin.finder.member.preview.y0(this));
        this.f121307g = "";
        this.f121308h = "";
        this.f121313p = "";
        this.f121317t = jz5.h.b(new com.tencent.mm.plugin.finder.member.preview.v0(this));
    }
}
