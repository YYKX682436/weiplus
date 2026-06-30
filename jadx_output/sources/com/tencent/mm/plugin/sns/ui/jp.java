package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class jp implements com.tencent.mm.plugin.sns.ui.lp {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f169534a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f169535b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f169536c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f169537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f169538e;

    public jp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI, java.lang.String str, com.tencent.mm.storage.u3 u3Var, java.util.List list, java.lang.Object obj) {
        this.f169538e = snsSettingUI;
        this.f169534a = "";
        this.f169535b = null;
        this.f169536c = null;
        this.f169537d = null;
        this.f169534a = str;
        this.f169536c = u3Var;
        this.f169535b = list;
        this.f169537d = obj;
    }

    @Override // com.tencent.mm.plugin.sns.ui.lp
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        return this.f169534a;
    }

    @Override // com.tencent.mm.plugin.sns.ui.lp
    public void b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.util.List list = this.f169535b;
            if (i17 >= list.size()) {
                db5.e1.b(this.f169538e, "", linkedList, linkedList2, "", new com.tencent.mm.plugin.sns.ui.ip(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
                return;
            } else {
                linkedList.add((java.lang.String) list.get(i17));
                linkedList2.add(java.lang.Integer.valueOf(i17));
                i17++;
            }
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.lp
    public java.lang.String value() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        java.lang.Object obj = this.f169537d;
        boolean z17 = obj instanceof int[];
        com.tencent.mm.storage.u3 u3Var = this.f169536c;
        int i17 = 0;
        java.util.List list = this.f169535b;
        if (z17) {
            if (gm0.j1.a()) {
                int r17 = gm0.j1.u().c().r(u3Var, 0);
                str = (java.lang.String) list.get(0);
                while (true) {
                    if (i17 < ((int[]) obj).length) {
                        if (r17 == ((int[]) obj)[i17] && i17 < list.size()) {
                            str = (java.lang.String) list.get(i17);
                            break;
                        }
                        i17++;
                    } else {
                        break;
                    }
                }
            }
            str = "";
        } else {
            if ((obj instanceof long[]) && gm0.j1.a()) {
                long t17 = gm0.j1.u().c().t(u3Var, 0L);
                java.lang.String str2 = (java.lang.String) list.get(0);
                while (true) {
                    if (i17 >= ((long[]) obj).length) {
                        str = str2;
                        break;
                    }
                    if (t17 == ((long[]) obj)[i17] && i17 < list.size()) {
                        str = (java.lang.String) list.get(i17);
                        break;
                    }
                    i17++;
                }
            }
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        return str;
    }
}
