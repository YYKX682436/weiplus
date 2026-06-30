package com.tencent.mm.plugin.finder.view.notice;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView;", "Landroid/widget/LinearLayout;", "", "color", "Ljz5/f0;", "setTextColor", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "d", "Ljz5/g;", "getTextView", "()Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NoticeDetailBindProductsView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoticeDetailBindProductsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final android.widget.TextView getTextView() {
        return (android.widget.TextView) ((jz5.n) this.textView).getValue();
    }

    public final void a(r45.h32 h32Var) {
        java.lang.String string;
        android.view.View findViewById;
        if (h32Var == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(this, "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.l94 b17 = zl2.t.b(h32Var);
        if (b17 == null || b17.getInteger(1) == 0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(this, "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = 2;
        java.util.List i18 = kz5.c0.i(findViewById(com.tencent.mm.R.id.u3i), findViewById(com.tencent.mm.R.id.u3j), findViewById(com.tencent.mm.R.id.u3k));
        int i19 = 0;
        for (java.lang.Object obj : i18) {
            int i27 = i19 + 1;
            jz5.f0 f0Var = null;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            java.util.LinkedList list = b17.getList(0);
            kotlin.jvm.internal.o.f(list, "getProducts(...)");
            r45.k94 k94Var = (r45.k94) kz5.n0.a0(list, i19);
            if (k94Var != null && (string = k94Var.getString(i17)) != null) {
                if (view != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(java.lang.Integer.valueOf(intValue4));
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view, arrayList8.toArray(), "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.h88)) != null) {
                    com.tencent.mm.plugin.finder.live.util.a3.f115443a.d(findViewById, string);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var != null) {
                    i19 = i27;
                    i17 = 2;
                }
            }
            if (view != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue5 = ((java.lang.Integer) arrayList9.get(0)).intValue();
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(java.lang.Integer.valueOf(intValue5));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/view/notice/NoticeDetailBindProductsView", "updateWithNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i19 = i27;
            i17 = 2;
        }
        getTextView().setText(b17.getInteger(1) > i18.size() ? getContext().getResources().getString(com.tencent.mm.R.string.oxl, java.lang.Integer.valueOf(b17.getInteger(1))) : getContext().getResources().getString(com.tencent.mm.R.string.oxk, java.lang.Integer.valueOf(b17.getInteger(1))));
    }

    public final void setTextColor(int i17) {
        getTextView().setTextColor(i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeDetailBindProductsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setOrientation(0);
        setGravity(16);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.elf, (android.view.ViewGroup) this, true);
        this.textView = jz5.h.b(new tx2.k0(this));
    }
}
