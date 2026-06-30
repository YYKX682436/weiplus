package f93;

/* loaded from: classes10.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260493d;

    public w1(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260493d = contactLabelManagerUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260493d;
        java.util.HashSet hashSet = contactLabelManagerUI.G;
        if (hashSet != null && hashSet.size() > 0) {
            arrayList.addAll(contactLabelManagerUI.G);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new f93.v1(this, new java.util.HashSet(k93.j.y(arrayList, -1).f305928b)));
    }
}
