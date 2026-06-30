package fc4;

/* loaded from: classes4.dex */
public final class v extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView O6(fc4.v vVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        vVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView) vVar.findViewById(com.tencent.mm.R.id.ncv);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        return heroSeekBarView;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        if (com.tencent.mm.plugin.sns.model.j4.d()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleScaleUIC", "setScaleEnable");
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) findViewById(com.tencent.mm.R.id.rpo);
            flexibleVideoView.setClickable(true);
            al5.u3.c(al5.y3.f6102a, getContext(), flexibleVideoView, flexibleVideoView.getVideoContainer(), new fc4.r(flexibleVideoView, this), new fc4.s(this, flexibleVideoView), new fc4.t(this), null, 64, null);
        } else {
            findViewById(com.tencent.mm.R.id.rpo).setOnLongClickListener(new fc4.u(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
    }
}
