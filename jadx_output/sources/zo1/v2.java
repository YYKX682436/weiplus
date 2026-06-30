package zo1;

/* loaded from: classes5.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474798d;

    public v2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI) {
        this.f474798d = packageManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.P);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 8L;
        roamBackupRecoverReport28098Struct.f60067e = 6L;
        roamBackupRecoverReport28098Struct.k();
        po1.c cVar = po1.d.f357294i;
        com.tencent.wechat.aff.affroam.g gVar = this.f474798d.f92839e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.u uVar = gVar.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.PackageManagerUI", "openLocation, device=" + a17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (a17.f357296b == po1.g.f357310h) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) ro1.v.f398014a.b();
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((po1.d) it.next()).f357300f, a17.f357300f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            java.lang.String str = a17.f357297c;
            java.lang.String str2 = a17.f357298d;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("deviceId", a17.f357295a);
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
            jSONObject2.put("remark", str2);
            jSONObject2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, a17.f357299e);
            jSONObject2.put("connection", z17);
            jSONObject.put("portableDevice", jSONObject2);
        } else {
            jSONObject.put("deviceId", a17.f357295a);
        }
        lo1.g.f320100a.b(jSONObject);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
