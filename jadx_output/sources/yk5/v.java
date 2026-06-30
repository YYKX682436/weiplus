package yk5;

/* loaded from: classes11.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.voicesearch.VoiceSearchResultUI f462917d;

    public v(com.tencent.mm.ui.voicesearch.VoiceSearchResultUI voiceSearchResultUI) {
        this.f462917d = voiceSearchResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.voicesearch.VoiceSearchResultUI voiceSearchResultUI = this.f462917d;
        if (!voiceSearchResultUI.f211182o) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(voiceSearchResultUI.f211181n);
            sb6.append(",");
            sb6.append(voiceSearchResultUI.f211179i);
            sb6.append(",");
            java.lang.String[] strArr = voiceSearchResultUI.f211176f;
            sb6.append(strArr == null ? 0 : strArr.length);
            sb6.append(",0");
            g0Var.kvStat(10452, sb6.toString());
        }
        if (voiceSearchResultUI.f211183p) {
            voiceSearchResultUI.moveTaskToBack(true);
        }
        voiceSearchResultUI.finish();
        return true;
    }
}
