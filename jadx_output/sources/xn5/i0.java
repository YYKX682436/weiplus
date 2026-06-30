package xn5;

/* loaded from: classes15.dex */
public final class i0 {
    public i0(kotlin.jvm.internal.i iVar) {
    }

    public final void A(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, float f17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            ((android.widget.LinearLayout.LayoutParams) layoutParams).weight = f17;
        }
    }

    public final void B(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        layoutParams.width = i17;
    }

    public final void C(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setMaxHeight(i17);
            return;
        }
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setMaxHeight(i17);
            return;
        }
        if (view instanceof android.widget.ProgressBar) {
            if (fp.h.c(29)) {
                ((android.widget.ProgressBar) view).setMaxHeight(i17);
            }
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setMaxHeight(i17);
        }
    }

    public final void D(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setMaxLines(i17);
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setMaxLines(i17);
        }
    }

    public final void E(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setMaxWidth(i17);
            return;
        }
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setMaxWidth(i17);
            return;
        }
        if (view instanceof android.widget.ProgressBar) {
            if (fp.h.c(29)) {
                ((android.widget.ProgressBar) view).setMaxWidth(i17);
            }
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setMaxWidth(i17);
        }
    }

    public final void F(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setMinHeight(i17);
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setMinHeight(i17);
        } else if ((view instanceof android.widget.ProgressBar) && fp.h.c(29)) {
            ((android.widget.ProgressBar) view).setMinHeight(i17);
        }
        view.setMinimumHeight(i17);
    }

    public final void G(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setMinWidth(i17);
            return;
        }
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setMinWidth(i17);
        } else if (!(view instanceof android.widget.ProgressBar)) {
            view.setMinimumWidth(i17);
        } else if (fp.h.c(29)) {
            ((android.widget.ProgressBar) view).setMinWidth(i17);
        }
    }

    public final void H(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.LinearLayout) {
            ((android.widget.LinearLayout) view).setOrientation(i17);
        } else if (view instanceof android.widget.GridLayout) {
            ((android.widget.GridLayout) view).setOrientation(i17);
        }
    }

    public final void I(android.content.Context ctx, android.view.View view, java.lang.String name, android.widget.ImageView.ScaleType value) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(value, "value");
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setScaleType(value);
        }
    }

    public final void J(android.content.Context ctx, android.view.View view, java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setSingleLine(z17);
        }
    }

    public final void K(android.content.Context ctx, android.view.View view, java.lang.String name, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setImageDrawable(drawable);
        }
    }

    public final void L(android.content.Context ctx, android.view.View view, java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(value, "value");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(value);
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).b(value);
        }
    }

    public final void M(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (fp.h.c(23) && (view instanceof android.widget.TextView)) {
            ((android.widget.TextView) view).setTextAppearance(i17);
        }
    }

    public final void N(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setTextColor(i17);
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setTextColor(i17);
        }
    }

    public final void O(android.content.Context ctx, android.view.View view, java.lang.String name, float f17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setTextSize(1, f17);
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).l(1, f17);
        }
    }

    public final void P(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/x2c/ViewAttrX2CMethod$Companion", "set_android_visibility", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/view/x2c/ViewAttrX2CMethod$Companion", "set_android_visibility", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a(android.view.ViewGroup.LayoutParams layoutParams, android.view.ViewGroup.LayoutParams to6) {
        kotlin.jvm.internal.o.g(to6, "to");
        if (layoutParams != null) {
            to6.width = layoutParams.width;
            to6.height = layoutParams.height;
        }
        if ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) && (to6 instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) to6;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
            marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
            marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
    }

    public final void b(android.content.Context ctx, android.view.View view, java.lang.String name, float f17, float f18) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setLineSpacing(f17, f18);
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).k(f17, f18);
        }
    }

    public final void c(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins(i17, i18, i19, i27);
        }
    }

    public final void d(android.content.Context ctx, android.view.View view, java.lang.String name, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        view.setPadding(i17, i18, i19, i27);
    }

    public final void e(android.content.Context ctx, android.view.View view, java.lang.String name, android.graphics.Typeface typeface) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(typeface, "typeface");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setTypeface(typeface);
        } else if (view instanceof android.widget.Switch) {
            ((android.widget.Switch) view).setTypeface(typeface);
        }
    }

    public final void f(android.content.Context ctx, android.view.View view, java.lang.String name, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        view.setBackground(drawable);
    }

    public final void g(android.content.Context ctx, android.view.View view, java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        view.setClickable(z17);
    }

    public final void h(android.content.Context ctx, android.view.View view, java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).setClipChildren(z17);
        }
    }

    public final void i(android.content.Context ctx, android.view.View view, java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).setClipToPadding(z17);
        }
    }

    public final void j(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setCompoundDrawablePadding(i17);
        }
    }

    public final void k(android.content.Context ctx, android.view.View view, java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        view.setDuplicateParentStateEnabled(z17);
    }

    public final void l(android.content.Context ctx, android.view.View view, java.lang.String name, android.text.TextUtils.TruncateAt value) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(value, "value");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setEllipsize(value);
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setEllipsize(value);
        }
    }

    public final void m(android.content.Context ctx, android.view.View view, java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(value, "value");
        if (fp.h.a(26)) {
            if (kotlin.jvm.internal.o.b(value, "true")) {
                view.setFocusable(true);
                return;
            } else {
                if (kotlin.jvm.internal.o.b(value, "false")) {
                    view.setFocusable(false);
                    return;
                }
                return;
            }
        }
        int hashCode = value.hashCode();
        if (hashCode == 3005871) {
            if (value.equals("auto")) {
                view.setFocusable(16);
            }
        } else if (hashCode == 3569038) {
            if (value.equals("true")) {
                view.setFocusable(1);
            }
        } else if (hashCode == 97196323 && value.equals("false")) {
            view.setFocusable(0);
        }
    }

    public final void n(android.content.Context ctx, android.view.View view, java.lang.String name, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (fp.h.c(23)) {
            view.setForeground(drawable);
        }
    }

    public final void o(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.LinearLayout) {
            ((android.widget.LinearLayout) view).setGravity(i17);
            return;
        }
        if (view instanceof android.widget.RelativeLayout) {
            ((android.widget.RelativeLayout) view).setGravity(i17);
            return;
        }
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setGravity(i17);
            return;
        }
        if (view instanceof android.widget.Spinner) {
            ((android.widget.Spinner) view).setGravity(i17);
            return;
        }
        if (view instanceof android.widget.GridView) {
            ((android.widget.GridView) view).setGravity(i17);
            return;
        }
        if (view instanceof android.widget.Gallery) {
            ((android.widget.Gallery) view).setGravity(i17);
        } else {
            if ((view instanceof android.widget.Toolbar) || !(view instanceof com.tencent.neattextview.textview.view.NeatTextView)) {
                return;
            }
            ((com.tencent.neattextview.textview.view.NeatTextView) view).setTextGravity(i17);
        }
    }

    public final void p(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        view.setId(i17);
    }

    public final void q(android.content.Context ctx, android.view.View view, java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setIncludeFontPadding(z17);
        }
    }

    public final void r(android.content.Context ctx, android.view.View view, java.lang.String name, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.widget.ProgressBar) {
            ((android.widget.ProgressBar) view).setIndeterminateDrawable(drawable);
        }
    }

    public final void s(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.view.ViewStub) {
            ((android.view.ViewStub) view).setInflatedId(i17);
        }
    }

    public final void t(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        view.setLayerType(i17, null);
    }

    public final void u(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof android.view.ViewStub) {
            ((android.view.ViewStub) view).setLayoutResource(i17);
        }
    }

    public final void v(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(13, i17);
        }
    }

    public final void w(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(15, i17);
        }
    }

    public final void x(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            ((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = i17;
            return;
        }
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = i17;
            return;
        }
        if (layoutParams instanceof android.widget.GridLayout.LayoutParams) {
            ((android.widget.GridLayout.LayoutParams) layoutParams).setGravity(i17);
        } else if (layoutParams instanceof android.widget.Toolbar.LayoutParams) {
            ((android.widget.Toolbar.LayoutParams) layoutParams).gravity = i17;
        } else if (layoutParams instanceof androidx.coordinatorlayout.widget.c) {
            ((androidx.coordinatorlayout.widget.c) layoutParams).f11008c = i17;
        }
    }

    public final void y(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        layoutParams.height = i17;
    }

    public final void z(android.content.Context ctx, android.view.ViewGroup.LayoutParams layoutParams, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        kotlin.jvm.internal.o.g(name, "name");
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(1, i17);
        }
    }
}
