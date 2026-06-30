package com.tencent.mm.pluginsdk.ui.preference;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/preference/VerifyRecordListView;", "Landroid/widget/LinearLayout;", "Ly35/j;", "args", "Ljz5/f0;", "setFMessageArgs", "", "forceHideReply", "setForceHideReply", "hide", "setHide", "Ly35/k;", "callback", "setGotoSayHiCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class VerifyRecordListView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public y35.j f191074d;

    /* renamed from: e, reason: collision with root package name */
    public y35.d f191075e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f191076f;

    /* renamed from: g, reason: collision with root package name */
    public final y35.d[] f191077g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191078h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f191079i;

    /* renamed from: m, reason: collision with root package name */
    public y35.k f191080m;

    /* renamed from: n, reason: collision with root package name */
    public final l75.q0 f191081n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyRecordListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f191077g = new y35.d[3];
        this.f191081n = new y35.j0(this);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.aa_));
        int i17 = 0;
        textView.setTextSize(0, i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479853h2));
        textView.setVisibility(8);
        this.f191076f = textView;
        addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -2));
        while (i17 < 3) {
            int i18 = i17 + 1;
            y35.d dVar = new y35.d(getContext(), i18);
            dVar.setBtnVisibility(8);
            dVar.setVisibility(8);
            addView(dVar, new android.widget.LinearLayout.LayoutParams(-1, -2));
            this.f191077g[i17] = dVar;
            i17 = i18;
        }
        y35.d dVar2 = new y35.d(getContext(), true);
        dVar2.setVisibility(8);
        this.f191075e = dVar2;
        addView(dVar2, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(y35.r[] r14) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView.a(y35.r[]):void");
    }

    public final void b() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj().remove(this.f191081n);
        for (y35.d dVar : this.f191077g) {
            if (dVar != null) {
                dVar.c();
            }
        }
        y35.d dVar2 = this.f191075e;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f191075e = null;
        this.f191076f = null;
        this.f191074d = null;
    }

    public final void c() {
        for (y35.d dVar : this.f191077g) {
            if (dVar != null) {
                dVar.setVisibility(8);
            }
        }
        y35.d dVar2 = this.f191075e;
        if (dVar2 != null) {
            dVar2.setVisibility(8);
        }
        android.widget.TextView textView = this.f191076f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj().add(this.f191081n);
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyRecordListView", "onAttachedToWindow, cloudListener registered");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void setFMessageArgs(y35.j jVar) {
        this.f191074d = jVar;
        y35.d.setFMessageArgs(jVar);
        if (jVar != null) {
            for (y35.d dVar : this.f191077g) {
                if (dVar != null) {
                    dVar.e();
                }
            }
            y35.d dVar2 = this.f191075e;
            if (dVar2 != null) {
                dVar2.e();
            }
        }
    }

    public final void setForceHideReply(boolean z17) {
        this.f191079i = z17;
    }

    public final void setGotoSayHiCallBack(y35.k kVar) {
        this.f191080m = kVar;
        y35.d dVar = this.f191075e;
        if (dVar != null) {
            dVar.setGotoSayHiCallBack(kVar);
        }
    }

    public final void setHide(boolean z17) {
        this.f191078h = z17;
    }
}
