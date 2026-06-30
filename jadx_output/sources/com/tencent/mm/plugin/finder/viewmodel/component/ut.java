package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ut extends com.tencent.mm.ui.component.UIComponent implements zy2.k9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f136172d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f136173e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f136174f;

    /* renamed from: g, reason: collision with root package name */
    public long f136175g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f136176h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136177i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f136178m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136172d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.tt(this));
        this.f136173e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.st(this));
        this.f136174f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.qt(this));
        this.f136176h = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.rt(this));
        this.f136178m = true;
    }

    public final void O6(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        ((cl0.g) ((jz5.n) this.f136172d).getValue()).o(key, i17);
    }

    public final void P6(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        ((cl0.g) ((jz5.n) this.f136172d).getValue()).h(key, value);
    }

    public final int Q6() {
        return ((java.lang.Number) this.f136176h.getValue()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(boolean r21) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.ut.R6(boolean):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (isBelongFragment() && getIsUserVisibleFocused() && this.f136178m) {
            R6(true);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (isBelongFragment() && getIsUserVisibleFocused() && this.f136178m) {
            R6(false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (this.f136178m) {
            R6(false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        if (this.f136178m) {
            R6(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f136172d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.tt(this));
        this.f136173e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.st(this));
        this.f136174f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.qt(this));
        this.f136176h = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.rt(this));
        this.f136178m = true;
    }
}
