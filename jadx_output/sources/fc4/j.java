package fc4;

/* loaded from: classes4.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f261170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        java.lang.String stringExtra = getIntent().getStringExtra("intent_localid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(stringExtra);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
            return;
        }
        this.f261170d = (android.widget.Button) findViewById(com.tencent.mm.R.id.gne);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        android.widget.Button button = this.f261170d;
        if (button == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        } else {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
            kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
            r45.q1 q1Var = timeLine.actionInfo;
            com.tencent.mm.plugin.sns.ui.ns nsVar = new com.tencent.mm.plugin.sns.ui.ns();
            com.tencent.mm.plugin.sns.ui.h7.a(getContext(), nsVar, timeLine.actionInfo);
            if (nsVar.W) {
                button.setVisibility(0);
                button.setText(nsVar.X);
                button.setOnClickListener(new fc4.i(q1Var, timeLine, this));
                if (getActivity().getRequestedOrientation() != 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
                    boolean k18 = com.tencent.mm.ui.bk.k(getContext());
                    int j17 = com.tencent.mm.ui.bk.j(getContext());
                    android.widget.Button button2 = this.f261170d;
                    if (button2 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
                    } else {
                        if (k18 && button2.getVisibility() == 0) {
                            android.view.ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
                            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin += j17;
                            button2.setLayoutParams(marginLayoutParams);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
                    }
                }
            } else {
                button.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
    }
}
