package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public abstract class f {
    public static boolean a() {
        return j62.e.g().i("clicfg_actionbar_title_text_size_default_switch", 1, true, false) == 1;
    }

    public static void b(android.widget.TextView textView, int i17) {
        if (a() && textView != null) {
            textView.setTextSize(0, i65.a.f(textView.getContext(), i17));
        }
    }
}
