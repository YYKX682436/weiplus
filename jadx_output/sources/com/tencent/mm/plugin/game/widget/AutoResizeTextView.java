package com.tencent.mm.plugin.game.widget;

/* loaded from: classes15.dex */
public class AutoResizeTextView extends android.widget.TextView implements s53.d {

    /* renamed from: d, reason: collision with root package name */
    public s53.e f141923d;

    public AutoResizeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        s53.e eVar = new s53.e(this);
        if (attributeSet != null) {
            int i18 = (int) eVar.f403173e;
            float f17 = eVar.f403175g;
            eVar.d(0, i18);
            if (eVar.f403175g != f17) {
                eVar.f403175g = f17;
                eVar.a();
            }
        }
        eVar.c(true);
        if (eVar.f403178j == null) {
            eVar.f403178j = new java.util.ArrayList();
        }
        eVar.f403178j.add(this);
        this.f141923d = eVar;
    }

    public s53.e getAutofitHelper() {
        return this.f141923d;
    }

    public float getMaxTextSize() {
        return this.f141923d.f403174f;
    }

    public float getMinTextSize() {
        return this.f141923d.f403173e;
    }

    public float getPrecision() {
        return this.f141923d.f403175g;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        s53.e eVar = this.f141923d;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i17) {
        super.setLines(i17);
        s53.e eVar = this.f141923d;
        if (eVar == null || eVar.f403172d == i17) {
            return;
        }
        eVar.f403172d = i17;
        eVar.a();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i17) {
        super.setMaxLines(i17);
        s53.e eVar = this.f141923d;
        if (eVar == null || eVar.f403172d == i17) {
            return;
        }
        eVar.f403172d = i17;
        eVar.a();
    }

    public void setMaxTextSize(float f17) {
        s53.e eVar = this.f141923d;
        android.content.Context context = eVar.f403169a.getContext();
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = android.util.TypedValue.applyDimension(2, f17, system.getDisplayMetrics());
        if (applyDimension != eVar.f403174f) {
            eVar.f403174f = applyDimension;
            eVar.a();
        }
    }

    public void setMinTextSize(int i17) {
        this.f141923d.d(2, i17);
    }

    public void setPrecision(float f17) {
        s53.e eVar = this.f141923d;
        if (eVar.f403175g != f17) {
            eVar.f403175g = f17;
            eVar.a();
        }
    }

    public void setSizeToFit(boolean z17) {
        this.f141923d.c(z17);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i17, float f17) {
        super.setTextSize(i17, f17);
        s53.e eVar = this.f141923d;
        if (eVar == null || eVar.f403177i) {
            return;
        }
        android.content.Context context = eVar.f403169a.getContext();
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = android.util.TypedValue.applyDimension(i17, f17, system.getDisplayMetrics());
        if (eVar.f403171c != applyDimension) {
            eVar.f403171c = applyDimension;
        }
    }

    public AutoResizeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17);
    }
}
