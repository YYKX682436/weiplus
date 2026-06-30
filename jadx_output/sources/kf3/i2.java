package kf3;

/* loaded from: classes11.dex */
public class i2 implements com.tencent.mm.pluginsdk.ui.a2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI f307361d;

    public i2(com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI massSendSelectContactUI) {
        this.f307361d = massSendSelectContactUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 != 1 || str == null) {
            return;
        }
        com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI massSendSelectContactUI = this.f307361d;
        ((java.util.LinkedList) massSendSelectContactUI.E).remove(str);
        massSendSelectContactUI.w7(((java.util.LinkedList) massSendSelectContactUI.E).size());
        massSendSelectContactUI.f206448f.notifyDataSetChanged();
    }
}
