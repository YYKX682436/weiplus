package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class sx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f170488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f170489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.vx f170490f;

    public sx(com.tencent.mm.plugin.sns.ui.vx vxVar, android.view.View view, android.view.View view2) {
        this.f170490f = vxVar;
        this.f170488d = view;
        this.f170489e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix initCommentView.");
        android.view.View view = this.f170489e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        com.tencent.mm.plugin.sns.ui.vx vxVar = this.f170490f;
        vxVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        android.view.View view2 = this.f170488d;
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view2.getTag();
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(baseViewHolder.f169268f);
        if (k17 != null) {
            m21.w.d(740);
            com.tencent.mm.plugin.sns.model.s5.e(k17);
            ca4.z0.T(k17);
            k17.isAd();
            k17.getUxinfo();
            k17.getUserName();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix cacheCommentContainer visible.");
        com.tencent.mm.plugin.sns.ui.bs bsVar = vxVar.f170718b;
        view.startAnimation(bsVar.f168048n);
        view.sendAccessibilityEvent(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f482840pe);
        vxVar.f170722f = linearLayout;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = bsVar.f168039e;
        linearLayout.setOnClickListener(iVar.f169816s);
        android.widget.LinearLayout linearLayout2 = vxVar.f170722f;
        android.view.View.OnTouchListener onTouchListener = bsVar.K;
        linearLayout2.setOnTouchListener(onTouchListener);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f482870qd);
        vxVar.f170723g = linearLayout3;
        linearLayout3.setOnClickListener(iVar.f169817t);
        vxVar.f170723g.setOnTouchListener(onTouchListener);
        vxVar.f170723g.setTag(baseViewHolder);
        vxVar.f170722f.setTag(baseViewHolder);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) vxVar.f170723g.findViewById(com.tencent.mm.R.id.f482869qc);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) vxVar.f170722f.findViewById(com.tencent.mm.R.id.f482831p5);
        weImageView2.setIconColor(view2.getResources().getColor(com.tencent.mm.R.color.f478553an));
        android.widget.TextView textView = (android.widget.TextView) vxVar.f170723g.findViewById(com.tencent.mm.R.id.f482871qe);
        android.widget.TextView textView2 = (android.widget.TextView) vxVar.f170722f.findViewById(com.tencent.mm.R.id.f482841pf);
        boolean f17 = com.tencent.mm.plugin.sns.storage.w2.f(baseViewHolder.f169264d);
        android.content.Context context = vxVar.f170717a;
        if (f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix isInValid.");
            vxVar.f170722f.setEnabled(false);
            vxVar.f170723g.setEnabled(false);
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a5z));
            if (baseViewHolder.f169260b == 10) {
                weImageView.setImageResource(com.tencent.mm.R.raw.friendactivity_comment_likeicon_golden_normal);
                weImageView2.setImageResource(com.tencent.mm.R.raw.friendactivity_comment_writeicon_golden_normal);
            } else {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_like);
                weImageView.setIconColor(view2.getResources().getColor(com.tencent.mm.R.color.f478553an));
                weImageView2.setImageResource(com.tencent.mm.R.raw.friendactivity_comment_writeicon_normal);
            }
            textView.setText(context.getString(com.tencent.mm.R.string.jc8));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a5z));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix Valid.");
            vxVar.f170722f.setEnabled(true);
            if (baseViewHolder.f169260b == 10) {
                weImageView.setImageResource(com.tencent.mm.R.drawable.alk);
                weImageView2.setImageResource(com.tencent.mm.R.drawable.all);
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a67));
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a67));
            } else {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            }
            vxVar.f170723g.setEnabled(true);
            if (baseViewHolder.f169270g == 0) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_like);
                weImageView.setIconColor(view2.getResources().getColor(com.tencent.mm.R.color.f478553an));
                textView.setText(context.getString(com.tencent.mm.R.string.jc8));
                textView.setContentDescription(context.getString(com.tencent.mm.R.string.jc8));
            } else {
                if (vxVar.f170720d) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
                    weImageView.setIconColor(view2.getResources().getColor(com.tencent.mm.R.color.f478532ac));
                } else {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_like);
                    weImageView.setIconColor(view2.getResources().getColor(com.tencent.mm.R.color.f478553an));
                }
                textView.setText(context.getString(com.tencent.mm.R.string.jam));
                textView.setContentDescription(context.getString(com.tencent.mm.R.string.j5o));
            }
        }
        if (baseViewHolder.f169260b == 10) {
            vxVar.f170723g.setBackgroundResource(com.tencent.mm.R.drawable.f481963an5);
            vxVar.f170722f.setBackgroundResource(com.tencent.mm.R.drawable.an6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$1");
    }
}
