package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes5.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f198784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198785h;

    public g0(com.tencent.mm.ui.chatting.component.biz.a aVar, boolean z17, java.lang.String str, java.lang.String str2, android.view.View.OnClickListener onClickListener) {
        this.f198785h = aVar;
        this.f198781d = z17;
        this.f198782e = str;
        this.f198783f = str2;
        this.f198784g = onClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f198781d;
        java.lang.String str = this.f198782e;
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198785h;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizTopSysMsgView hide, trace : %s", str);
            android.view.View view = aVar.D;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                aVar.D = null;
                return;
            }
            return;
        }
        java.lang.String str2 = this.f198783f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizTopSysMsgView show, trace : %s, wording : %s", str, str2);
        if (aVar.D == null) {
            com.tencent.mm.ui.chatting.component.z4.j(aVar.f198580d.f460717l, com.tencent.mm.R.id.vnd);
            aVar.D = aVar.f198580d.c(com.tencent.mm.R.id.s7o);
        }
        android.view.View view2 = aVar.D;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int b17 = i65.a.b(aVar.f198580d.g(), 60);
            android.view.ViewGroup f17 = aVar.f198580d.p().f();
            if (f17.getTag(com.tencent.mm.R.id.bgd) instanceof java.lang.Integer) {
                int intValue = ((java.lang.Integer) f17.getTag(com.tencent.mm.R.id.bgd)).intValue();
                if (b17 != intValue) {
                    int i17 = b17 - intValue;
                    f17.setTag(com.tencent.mm.R.id.bgd, java.lang.Integer.valueOf(i17));
                    f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + i17, f17.getPaddingRight(), f17.getPaddingBottom());
                }
            } else {
                f17.setTag(com.tencent.mm.R.id.bgd, java.lang.Integer.valueOf(b17));
                f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + b17, f17.getPaddingRight(), f17.getPaddingBottom());
            }
            android.widget.TextView textView = (android.widget.TextView) aVar.f198580d.c(com.tencent.mm.R.id.siv);
            if (textView != null) {
                textView.setText(str2);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) aVar.f198580d.c(com.tencent.mm.R.id.sis);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) aVar.f198580d.c(com.tencent.mm.R.id.siw);
            android.view.View.OnClickListener onClickListener = this.f198784g;
            if (onClickListener != null) {
                aVar.D.setOnClickListener(onClickListener);
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                    return;
                }
                return;
            }
            aVar.D.setOnClickListener(null);
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
        }
    }
}
