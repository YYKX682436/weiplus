package e45;

/* loaded from: classes.dex */
public final class x extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        android.content.Intent intent2 = getActivity().getIntent();
        int intExtra = intent2 != null ? intent2.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) : 0;
        boolean z17 = intExtra == 0;
        boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSelectorMultiSelect()) == 1;
        boolean z19 = z18 && z17;
        if (z19) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SystemFileSelectorUIC", "openFileManager, allowMultiple=" + z19 + ", multiSelectEnabled=" + z18 + ", scene=" + intExtra);
            getActivity().startActivityForResult(intent, 14);
        } catch (android.content.ActivityNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SystemFileSelectorUIC", e17, "goToSystemFileSelector ActivityNotFound", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SystemFileSelectorUIC", e18, "goToSystemFileSelector", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.widget.TextView textView = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.qxm);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) getActivity().findViewById(com.tencent.mm.R.id.f483495hr0);
        if (weButton != null) {
            weButton.setOnClickListener(new e45.w(this));
        }
    }
}
