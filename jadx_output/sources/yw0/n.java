package yw0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView f466571a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f466572b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f466573c;

    /* renamed from: d, reason: collision with root package name */
    public final float f466574d;

    /* renamed from: e, reason: collision with root package name */
    public final yw0.l f466575e;

    public n(com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView mcReferenceLineView, android.widget.TextView mcReferenceTipTextView) {
        kotlin.jvm.internal.o.g(mcReferenceLineView, "mcReferenceLineView");
        kotlin.jvm.internal.o.g(mcReferenceTipTextView, "mcReferenceTipTextView");
        this.f466571a = mcReferenceLineView;
        this.f466572b = mcReferenceTipTextView;
        this.f466573c = new java.util.HashMap();
        this.f466574d = j65.q.a(mcReferenceTipTextView.getContext()).getDimension(com.tencent.mm.R.dimen.f479723df);
        this.f466575e = new yw0.l(this);
    }

    public final void a(android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        d();
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        int generateViewId = android.view.View.generateViewId();
        com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView mCReferenceLineView = this.f466571a;
        mCReferenceLineView.setId(generateViewId);
        parent.addView(mCReferenceLineView, layoutParams);
    }

    public final yw0.s b(yw0.q drawType) {
        kotlin.jvm.internal.o.g(drawType, "drawType");
        yw0.s sVar = (yw0.s) this.f466573c.get(drawType);
        return sVar == null ? c(drawType) : sVar;
    }

    public final yw0.s c(yw0.q drawType) {
        yw0.s kVar;
        kotlin.jvm.internal.o.g(drawType, "drawType");
        int ordinal = drawType.ordinal();
        yw0.l lVar = this.f466575e;
        com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView mCReferenceLineView = this.f466571a;
        if (ordinal == 0) {
            android.content.Context context = mCReferenceLineView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kVar = new yw0.k(context, lVar);
        } else if (ordinal == 1) {
            android.content.Context context2 = mCReferenceLineView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            kVar = new yw0.t(context2, lVar);
        } else if (ordinal == 2) {
            android.content.Context context3 = mCReferenceLineView.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            kVar = new yw0.b(context3, lVar);
        } else if (ordinal == 3) {
            android.content.Context context4 = mCReferenceLineView.getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            kVar = new yw0.g(context4, lVar);
        } else {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            android.content.Context context5 = mCReferenceLineView.getContext();
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            kVar = new yw0.p(context5, lVar);
        }
        this.f466573c.put(drawType, kVar);
        mCReferenceLineView.getClass();
        java.util.ArrayList arrayList = mCReferenceLineView.f69685d;
        if (!arrayList.contains(kVar)) {
            arrayList.add(kVar);
        }
        return kVar;
    }

    public final void d() {
        com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView mCReferenceLineView = this.f466571a;
        kotlin.jvm.internal.o.g(mCReferenceLineView, "<this>");
        android.view.ViewParent parent = mCReferenceLineView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(mCReferenceLineView);
        }
    }

    public final void e(yw0.q drawType) {
        kotlin.jvm.internal.o.g(drawType, "drawType");
        java.util.HashMap hashMap = this.f466573c;
        yw0.s sVar = (yw0.s) hashMap.get(drawType);
        if (sVar != null) {
            com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView mCReferenceLineView = this.f466571a;
            mCReferenceLineView.getClass();
            mCReferenceLineView.f69685d.remove(sVar);
        }
        hashMap.remove(drawType);
    }
}
