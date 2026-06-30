package com.tencent.mm.plugin.finder.live.model.danmakuitem;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFreeFloatMsgConvert;", "Lin5/r;", "Lhk2/m;", "Landroidx/lifecycle/v;", "Lgk2/e;", "buContext", "<init>", "(Lgk2/e;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveFreeFloatMsgConvert extends in5.r implements androidx.lifecycle.v {

    /* renamed from: e, reason: collision with root package name */
    public r45.be6 f111737e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f111738f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111739g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f111740h;

    public LiveFreeFloatMsgConvert(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f111740h = new com.tencent.mm.sdk.platformtools.b4("LiveFreeFloatMsg::Timer", (com.tencent.mm.sdk.platformtools.a4) new hk2.q(this), true);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dnz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        androidx.lifecycle.o mo133getLifecycle;
        java.lang.String obj;
        java.lang.Object obj2;
        hk2.m item = (hk2.m) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(obj2, 1)) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                p(holder, item);
                return;
            }
        }
        this.f111738f = holder;
        r45.be6 be6Var = (r45.be6) item.f281908d.getCustom(5);
        this.f111737e = be6Var;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.pxj);
        android.content.Context context = holder.f293121e;
        if (be6Var == null || (string = be6Var.getString(2)) == null) {
            string = context.getResources().getString(com.tencent.mm.R.string.dki);
        }
        kotlin.jvm.internal.o.d(string);
        if (textView != null && (obj = android.text.TextUtils.ellipsize(string, textView.getPaint(), i65.a.a(context, 51.5f), android.text.TextUtils.TruncateAt.END).toString()) != null) {
            string = obj;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindDscTip wording=");
        sb6.append(be6Var != null ? be6Var.getString(2) : null);
        sb6.append(" finalText=");
        sb6.append(string);
        com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", sb6.toString());
        if (textView != null) {
            textView.setText(string);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.pxh);
        if (android.text.TextUtils.isEmpty(be6Var != null ? be6Var.getString(1) : null)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFreeFloatMsgConvert", "bindDscTip", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/StayLiveFreeFloatMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFreeFloatMsgConvert", "bindDscTip", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/StayLiveFreeFloatMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            yo0.i h17 = g1Var.h(mn2.f1.f329964r);
            mn2.q3 q3Var = new mn2.q3(be6Var != null ? be6Var.getString(1) : null, com.tencent.mm.plugin.finder.storage.y90.f128356f);
            vo0.d e17 = g1Var.e();
            kotlin.jvm.internal.o.d(weImageView);
            e17.c(q3Var, weImageView, h17);
        }
        n(holder, this.f111737e);
        p(holder, item);
        o();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "registerLifecycleListener");
        mo133getLifecycle.c(this);
        mo133getLifecycle.a(this);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.pxj);
        d92.f fVar = d92.f.f227470a;
        if (textView != null) {
            fVar.l(textView, 17.0f, false);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.pxi);
        if (textView2 != null) {
            fVar.l(textView2, 17.0f, false);
        }
    }

    public final void n(in5.s0 s0Var, r45.be6 be6Var) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = s0Var != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.pud) : null;
        android.widget.TextView textView = s0Var != null ? (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.pxi) : null;
        int a17 = be6Var != null ? zl2.s4.a(be6Var) : 0;
        if (a17 > 0) {
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            java.lang.String a18 = no0.l.a(no0.m.f338730a, a17, ":", false, false, false, 24, null);
            if (textView == null) {
                return;
            }
            textView.setText(a18);
            return;
        }
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        if (textView != null) {
            textView.setText(com.tencent.mm.R.string.f491565m36);
        }
        com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "bindCountDownTip stopTimer");
        this.f111739g = false;
        this.f111740h.d();
    }

    public final void o() {
        r45.be6 be6Var = this.f111737e;
        int a17 = be6Var != null ? zl2.s4.a(be6Var) : 0;
        com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "startCountdownTimer startedTimer=" + this.f111739g + " countDown=" + a17);
        if (this.f111739g || a17 <= 0) {
            return;
        }
        this.f111739g = true;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f111740h;
        b4Var.d();
        b4Var.c(1000L, 1000L);
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = hk2.o.f281911a[event.ordinal()];
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "ON_RESUME");
            o();
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "ON_PAUSE");
            this.f111739g = false;
            this.f111740h.d();
        } else {
            if (i17 != 3) {
                return;
            }
            com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "ON_DESTROY");
            in5.s0 s0Var = this.f111738f;
            java.lang.Object obj = s0Var != null ? s0Var.f293121e : null;
            com.tencent.mm.ui.MMActivity mMActivity = obj instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) obj : null;
            if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "unRegisterLifecycleListener");
            mo133getLifecycle.c(this);
        }
    }

    public final void p(in5.s0 s0Var, hk2.m mVar) {
        com.tencent.mars.xlog.Log.i("LiveFreeFloatMsgConvert", "updateSelectStatus isSelected=" + mVar.f281909e);
        s0Var.p(com.tencent.mm.R.id.f484803q42).setBackgroundResource(mVar.f281909e ? com.tencent.mm.R.drawable.cgf : com.tencent.mm.R.drawable.c49);
    }
}
