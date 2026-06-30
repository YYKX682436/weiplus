package po3;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.plugin.notification.base.j {
    @Override // com.tencent.mm.plugin.notification.base.j
    public boolean b(java.lang.String str, long j17) {
        if (p94.w0.e() != null) {
            com.tencent.mm.plugin.sns.storage.f2 f2Var = (com.tencent.mm.plugin.sns.storage.f2) p94.w0.e();
            f2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIfExistByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            r0 = f2Var.i1((int) j17) != null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIfExistByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        return r0;
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.util.ArrayList e(java.lang.Object obj) {
        java.util.ArrayList f17 = ((com.tencent.mm.plugin.sns.storage.f2) p94.w0.e()).f1();
        if (f17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendSnsFailNotification", "getAllFailMsgFromDb, resendList is empty");
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f17.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.mm.plugin.msg.MsgIdTalker(((java.lang.Long) it.next()).longValue(), ""));
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String f(int i17) {
        return this.f152446d.getString(com.tencent.mm.R.string.had, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public long g(java.lang.Object obj) {
        return ((po3.g) obj).f357328a;
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public com.tencent.mm.plugin.msg.MsgIdTalker h(java.lang.Object obj) {
        return new com.tencent.mm.plugin.msg.MsgIdTalker(((po3.g) obj).f357328a, "");
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String i(int i17, int i18, int i19) {
        android.content.Context context = this.f152446d;
        return i19 <= 0 ? context.getString(com.tencent.mm.R.string.hbj, java.lang.Integer.valueOf(i18)) : context.getString(com.tencent.mm.R.string.hae, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String j(int i17, int i18, int i19) {
        return this.f152446d.getString(com.tencent.mm.R.string.hbn, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String k(int i17, int i18) {
        return this.f152446d.getString(com.tencent.mm.R.string.hbm, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public int l() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public void n(java.util.ArrayList arrayList) {
        com.tencent.mm.autogen.events.OmitAllResendSnsEvent omitAllResendSnsEvent = new com.tencent.mm.autogen.events.OmitAllResendSnsEvent();
        omitAllResendSnsEvent.f54560g.f6686a = arrayList;
        omitAllResendSnsEvent.e();
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public void o() {
        if (gm0.j1.a()) {
            c01.d9.b().p().w(589825, java.lang.Boolean.FALSE);
        }
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public void p() {
        android.content.ComponentName componentName;
        android.content.Context context = this.f152446d;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1);
        if (runningTasks == null || runningTasks.size() <= 0 || (componentName = runningTasks.get(0).topActivity) == null || !componentName.getClassName().contains("SnsTimeLineUI")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_resume_state", false);
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            intent.putExtra("preferred_tab", 2);
            intent.putExtra("From_fail_notify", true);
            intent.putExtra("jump_sns_from_notify", true);
            intent.addFlags(67108864);
            intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent, null);
        }
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public void v(java.lang.String str, long j17) {
        com.tencent.mm.sdk.platformtools.u3.h(new po3.n(this, j17));
    }
}
