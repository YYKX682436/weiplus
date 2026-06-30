package com.tencent.mm.plugin.wenote.flutter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wenote/flutter/WeNoteFlutterUI;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class WeNoteFlutterUI extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f188111v = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f188112u = "";

    public final void a7() {
        if (isChangingConfigurations()) {
            ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f188112u);
            if (wi6 != null) {
                ((ez4.u) wi6).f257946e = true;
            }
        }
    }

    public final void b7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterUI", "setWindowStyle: orientation=" + i17);
        if (i17 == 2) {
            getWindow().addFlags(1024);
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            getWindow().clearFlags(1024);
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        return false;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        cz4.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterUI", "finish: ");
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f188112u);
        if (wi6 != null && (fVar = ((ez4.u) wi6).a().f245465c) != null) {
            fVar.p();
        }
        super.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x02cb, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bf A[Catch: all -> 0x033c, TryCatch #1 {all -> 0x033c, blocks: (B:119:0x0277, B:121:0x0295, B:129:0x02aa, B:132:0x02b7, B:134:0x02bf, B:141:0x02da, B:144:0x02ed, B:147:0x02fa, B:150:0x0307, B:153:0x031b, B:156:0x0328, B:176:0x02cd), top: B:118:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b5  */
    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r37, int r38, android.content.Intent r39) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f188112u);
        if (wi6 != null) {
            ez4.u uVar = (ez4.u) wi6;
            uVar.b().getClass();
            boolean z17 = false;
            if (hz4.b0.a().f286382a) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                u1Var.g(getString(com.tencent.mm.R.string.h_x));
                u1Var.n(getString(com.tencent.mm.R.string.f490454vi));
                u1Var.a(true);
                u1Var.q(false);
                z17 = true;
            }
            if (z17 || uVar.a().a(true)) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterUI", "onConfigurationChanged: orientation=" + newConfig.orientation);
        b7(newConfig.orientation);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.String str;
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f188112u);
        a7();
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterUI", "onDestroy: isChangingConfigurations=" + isChangingConfigurations());
        if (wi6 != null) {
            ez4.u uVar = (ez4.u) wi6;
            dz4.v3 v3Var = (dz4.v3) ((jz5.n) uVar.f257966y).getValue();
            java.lang.String str2 = v3Var.f245438b;
            com.tencent.mars.xlog.Log.i(str2, "onActivityDestroy");
            dz4.i iVar = ((ez4.u) v3Var.f245437a).f257942a;
            boolean z17 = iVar.f245291b;
            hz4.i iVar2 = iVar.f245300k;
            int i17 = iVar2 != null ? iVar2.f286426b : 0;
            java.lang.String str3 = iVar2 != null ? iVar2.f286425a : null;
            if (iVar2 == null || (str = iVar2.a(iVar.f245301l)) == null) {
                str = "";
            }
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteOpenReportStruct favoriteNoteOpenReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteOpenReportStruct();
            favoriteNoteOpenReportStruct.f56348d = i17;
            favoriteNoteOpenReportStruct.f56349e = favoriteNoteOpenReportStruct.b("sessionID", str3, true);
            favoriteNoteOpenReportStruct.f56350f = favoriteNoteOpenReportStruct.b("noteid", str, true);
            favoriteNoteOpenReportStruct.f56352h = z17 ? 1 : 0;
            favoriteNoteOpenReportStruct.k();
            com.tencent.mars.xlog.Log.i(str2, "report14789: openNoteFrom=" + i17 + ", owner=" + (z17 ? 1 : 0) + ", noteId=" + str + ", sessionId=" + str3);
            dz4.y1 a17 = uVar.a();
            cz4.f fVar = a17.f245465c;
            if (fVar != null) {
                fVar.o0();
            }
            com.tencent.mm.plugin.wenote.multitask.e eVar = a17.f245466d;
            if (eVar != null) {
                eVar.f188132x.clear();
                com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "onDestroy");
            }
            a17.f245466d = null;
            dz4.l3 l3Var = (dz4.l3) ((jz5.n) uVar.f257956o).getValue();
            if (kotlinx.coroutines.z0.h((kotlinx.coroutines.y0) ((jz5.n) l3Var.f245344a).getValue())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMsgDownloadHelper", "onActivityDestroy: cancel coroutineScope");
                kotlinx.coroutines.z0.e((kotlinx.coroutines.y0) ((jz5.n) l3Var.f245344a).getValue(), null, 1, null);
            }
            ((dz4.k1) ((jz5.n) uVar.f257955n).getValue()).a();
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterUI", "onPause: isChangingConfigurations=" + isChangingConfigurations());
        a7();
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f188112u);
        if (wi6 != null) {
            dz4.y1 a17 = ((ez4.u) wi6).a();
            cz4.f fVar = a17.f245465c;
            if (fVar != null) {
                fVar.z();
            }
            com.tencent.mm.plugin.wenote.multitask.e eVar = a17.f245466d;
            if (eVar != null) {
                eVar.A();
            }
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterUI", "onResume: ");
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f188112u);
        if (wi6 != null) {
            dz4.y1 a17 = ((ez4.u) wi6).a();
            cz4.f fVar = a17.f245465c;
            if (fVar != null) {
                fVar.x();
            }
            com.tencent.mm.plugin.wenote.multitask.e eVar = a17.f245466d;
            if (eVar != null) {
                eVar.z();
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        a7();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterUI", "onStop: isChangingConfigurations=" + isChangingConfigurations());
    }
}
