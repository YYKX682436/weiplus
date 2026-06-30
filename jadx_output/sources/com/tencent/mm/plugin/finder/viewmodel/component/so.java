package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes7.dex */
public final class so implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.uo f135912d;

    public so(com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar) {
        this.f135912d = uoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        al5.v vVar;
        java.lang.String str = (java.lang.String) kz5.h0.C(this.f135912d.f136149e);
        if (str == null) {
            this.f135912d.f136153i = false;
            com.tencent.mars.xlog.Log.i("Finder.FinderMagicEmojiUIC", "stop trigger");
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.qo qoVar = (com.tencent.mm.plugin.finder.viewmodel.component.qo) this.f135912d.f136148d.get(str);
        if (qoVar == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
        android.view.View view = qoVar.f135724a;
        jz5.f0 f0Var = null;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
            if (view instanceof android.widget.TextView) {
                java.lang.CharSequence text = ((android.widget.TextView) view).getText();
                android.text.SpannedString spannedString = text instanceof android.text.SpannedString ? (android.text.SpannedString) text : null;
                if (spannedString != null) {
                    al5.v[] vVarArr = (al5.v[]) spannedString.getSpans(0, spannedString.length(), al5.v.class);
                    kotlin.jvm.internal.o.d(vVarArr);
                    int length = vVarArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            vVar = null;
                            break;
                        }
                        vVar = vVarArr[i18];
                        if (kotlin.jvm.internal.o.b(vVar.f6072f, "finder_thank_fireworks_icon.png")) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (vVar != null) {
                        android.graphics.RectF rectF = vVar.f6073g;
                        int i19 = rect.left + ((int) rectF.left);
                        rect.left = i19;
                        rect.top += (int) rectF.top;
                        rect.right = (int) (i19 + rectF.width());
                        rect.bottom = (int) (rect.top + rectF.height());
                    }
                }
            }
        }
        int i27 = rect.top;
        int i28 = this.f135912d.f136150f;
        rect.top = i27 - i28;
        rect.bottom -= i28;
        if (rect.width() != 0 && (i17 = rect.left) >= 0) {
            com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView = this.f135912d.f136154m;
            if (i17 <= (mEHolderView != null ? mEHolderView.getWidth() : 0)) {
                int i29 = rect.top;
                com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView2 = this.f135912d.f136154m;
                if (i29 <= (mEHolderView2 != null ? mEHolderView2.getHeight() : 0)) {
                    qoVar.f135724a = null;
                    android.graphics.RectF rectF2 = qoVar.f135725b.f448367e;
                    if (rectF2 != null) {
                        rectF2.set(rect);
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar = this.f135912d;
                    java.lang.System.currentTimeMillis();
                    uoVar.getClass();
                    com.tencent.mars.xlog.Log.i("Finder.FinderMagicEmojiUIC", "doTrigger ".concat(str));
                    s12.f fVar = (s12.f) ((xp0.f) i95.n0.c(xp0.f.class));
                    fVar.getClass();
                    rk0.c.c("MagicFinderEmojiService", "triggerEmoji id:".concat(str), new java.lang.Object[0]);
                    s12.e eVar = fVar.f402129d;
                    if (eVar != null) {
                        com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.uo) eVar.f402128h;
                        uoVar2.getClass();
                        com.tencent.mm.plugin.finder.viewmodel.component.qo qoVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.qo) uoVar2.f136148d.get(str);
                        wp0.b bVar = qoVar2 != null ? qoVar2.f135725b : null;
                        if (bVar != null) {
                            java.lang.String a17 = bVar.a(1, "");
                            jc3.j0 j0Var = eVar.f448375f;
                            if (j0Var != null) {
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                com.tencent.mm.autogen.mmdata.rpt.MagicEmojiTriggerStruct magicEmojiTriggerStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicEmojiTriggerStruct();
                                magicEmojiTriggerStruct.f59095f = currentTimeMillis;
                                magicEmojiTriggerStruct.f59094e = 8;
                                magicEmojiTriggerStruct.k();
                                rc3.w0 w0Var = (rc3.w0) j0Var;
                                w0Var.A();
                                w0Var.k("MagicEmojiSent", a17);
                                f0Var = jz5.f0.f302826a;
                            }
                            if (f0Var == null) {
                                com.tencent.mars.xlog.Log.e("MagicEmojiFinderCommentBiz", "triggerEmoji without biz...");
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar3 = this.f135912d;
                    uoVar3.getClass();
                    com.tencent.mm.plugin.finder.viewmodel.component.so soVar = new com.tencent.mm.plugin.finder.viewmodel.component.so(uoVar3);
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(soVar, 700L);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMagicEmojiUIC", "skip Trigger");
        com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar4 = this.f135912d;
        uoVar4.getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.so soVar2 = new com.tencent.mm.plugin.finder.viewmodel.component.so(uoVar4);
        java.util.regex.Pattern pattern2 = pm0.v.f356802a;
        com.tencent.mm.sdk.platformtools.u3.i(soVar2, 0L);
    }
}
