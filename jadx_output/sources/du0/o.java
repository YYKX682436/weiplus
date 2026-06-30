package du0;

/* loaded from: classes5.dex */
public abstract class o extends du0.g implements dv0.a {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243390i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f243391m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f243392n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f243393o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f243394p;

    /* renamed from: q, reason: collision with root package name */
    public final cv0.f f243395q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f243396r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f243397s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f243398t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f243399u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f243400v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f243401w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f243402x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243390i = jz5.h.b(new du0.k(this));
        this.f243391m = jz5.h.b(new du0.h(this));
        this.f243392n = jz5.h.b(new du0.n(this));
        this.f243393o = jz5.h.b(new du0.m(this));
        this.f243394p = new java.util.LinkedHashMap();
        cv0.l lVar = cv0.h.f222538a;
        cv0.e eVar = cv0.e.f222531d;
        cv0.e eVar2 = cv0.e.f222530c;
        this.f243395q = new cv0.f(eVar, eVar, eVar2);
        this.f243398t = new com.tencent.maas.base.Vec2();
        this.f243399u = new android.graphics.Rect();
        this.f243400v = jz5.h.b(new du0.j(this));
        this.f243401w = jz5.h.b(new du0.i(this));
        this.f243402x = new android.graphics.Rect();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) kz5.c1.l(new jz5.l(bu0.b.f24482m, new cv0.f(eVar, eVar2, eVar2)), new jz5.l(bu0.b.f24481i, new cv0.f(eVar, eVar2, eVar2)), new jz5.l(bu0.b.f24477e, new cv0.f(eVar, eVar, eVar2)), new jz5.l(bu0.b.f24478f, new cv0.f(eVar, eVar, eVar2)), new jz5.l(bu0.b.f24483n, new cv0.f(eVar, eVar, eVar2)), new jz5.l(bu0.b.f24484o, new cv0.f(eVar, eVar2, eVar2)), new jz5.l(bu0.b.f24485p, new cv0.f(eVar, eVar2, eVar2)))).entrySet()) {
            bu0.b materialType = (bu0.b) entry.getKey();
            cv0.f options = (cv0.f) entry.getValue();
            kotlin.jvm.internal.o.g(materialType, "materialType");
            kotlin.jvm.internal.o.g(options, "options");
            this.f243394p.put(materialType, options);
        }
    }

    public static /* synthetic */ void o7(du0.o oVar, com.tencent.maas.base.MJID mjid, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHandleBoxForItem");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        oVar.n7(mjid, z17, z18);
    }

    public final void U6(boolean z17) {
        if (q()) {
            X6().l(z17);
        }
    }

    public abstract cv0.c V6();

    public final gx0.w W6() {
        return (gx0.w) ((jz5.n) this.f243391m).getValue();
    }

    public final cv0.c X6() {
        return (cv0.c) ((jz5.n) this.f243401w).getValue();
    }

    public final yw0.k Y6() {
        return (yw0.k) ((jz5.n) this.f243400v).getValue();
    }

    public final java.util.List Z6(bu0.b materialType) {
        kotlin.jvm.internal.o.g(materialType, "materialType");
        com.tencent.maas.base.Vec2 b76 = b7();
        cv0.l lVar = cv0.h.f222538a;
        com.tencent.maas.model.MJSpatialInfo mJSpatialInfo = new com.tencent.maas.model.MJSpatialInfo(1.0f, 0.0f, new com.tencent.maas.base.Vec2(0.0f, 11.0f), new com.tencent.maas.base.Vec2(0.5f, 0.5f));
        mJSpatialInfo.setPosition(new com.tencent.maas.base.Vec2(mJSpatialInfo.getPosition().f47799x, mJSpatialInfo.getPosition().f47800y / b76.f47800y));
        float f17 = 9.0f / b76.f47799x;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        int ordinal = materialType.ordinal();
        if (ordinal == 1) {
            return cv0.h.d(cv0.h.c(context, com.tencent.mm.R.string.m_h), mJSpatialInfo, f17);
        }
        if (ordinal == 2) {
            return cv0.h.d(cv0.h.c(context, com.tencent.mm.R.string.m_l), mJSpatialInfo, f17);
        }
        switch (ordinal) {
            case 5:
                return cv0.h.d(cv0.h.c(context, com.tencent.mm.R.string.m_i), mJSpatialInfo, f17);
            case 6:
                return cv0.h.d(cv0.h.c(context, com.tencent.mm.R.string.m_g), mJSpatialInfo, f17);
            case 7:
                return cv0.h.d(cv0.h.c(context, com.tencent.mm.R.string.m_j), mJSpatialInfo, f17);
            case 8:
                return cv0.h.d(cv0.h.c(context, com.tencent.mm.R.string.m_k), mJSpatialInfo, f17);
            case 9:
                return cv0.h.d(cv0.h.c(context, com.tencent.mm.R.string.m_f), mJSpatialInfo, f17);
            default:
                return kz5.p0.f313996d;
        }
    }

    public final yt0.c a7() {
        return (yt0.c) ((jz5.n) this.f243390i).getValue();
    }

    public com.tencent.maas.base.Vec2 b7() {
        android.view.View view = this.f243397s;
        com.tencent.maas.base.Vec2 vec2 = this.f243398t;
        if (view != null) {
            vec2.set(view.getScaleX(), view.getScaleY());
        }
        return vec2;
    }

    public void c7(au0.b boxItem) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
    }

    public void d7() {
    }

    public boolean e7(com.tencent.maas.base.MJID mjID) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        return true;
    }

    public final boolean f7(com.tencent.maas.base.MJID segmentID) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        cv0.c X6 = X6();
        X6.getClass();
        java.util.ArrayList arrayList = X6.f222529d;
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((cv0.a) obj).f222523a.c(), segmentID)) {
                break;
            }
        }
        return obj != null;
    }

    public abstract hw0.n g7();

    public abstract ow0.a0 h7();

    public abstract gx0.w i7();

    public abstract yt0.c k7();

    public final void l7() {
        cv0.c X6;
        au0.b n17;
        if (!q() || (n17 = (X6 = X6()).n()) == null) {
            return;
        }
        X6.o(n17);
        du0.o oVar = (du0.o) X6.f222528c;
        oVar.getClass();
        oVar.m7(n17, false);
    }

    public void m7(au0.b boxItem, boolean z17) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
    }

    public final void n7(com.tencent.maas.base.MJID mjID, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        cv0.c X6 = X6();
        X6.getClass();
        X6.j(mjID, null, z17, z18);
    }

    @Override // du0.g, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f243397s = contentView.findViewById(com.tencent.mm.R.id.s3j);
        this.f243396r = contentView.findViewById(com.tencent.mm.R.id.q8q);
        d7();
    }

    public final void p7() {
        if (a7().A4()) {
            a7().j();
        }
    }
}
