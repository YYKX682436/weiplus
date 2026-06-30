package e55;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le55/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-ai_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        i55.b bVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString("page_name");
            int i17 = bundle.getInt("page_hash_code");
            long j17 = bundle.getLong("event_time");
            int i18 = bundle.getInt("tab_index");
            boolean z17 = bundle.getBoolean("is_fragment");
            java.lang.String string2 = bundle.getString("page_event");
            int i19 = bundle.getInt("page_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotReporter", "other process call: pageEvent = [" + string2 + "] pageName [" + string + "] pageHash [" + i17 + "] eventTime [" + j17 + "] tabIndex [" + i18 + "] isFragment = [" + z17 + ']');
            if (string2 != null) {
                switch (string2.hashCode()) {
                    case -1411074045:
                        if (string2.equals("app_in")) {
                            e55.m mVar = e55.m.f249681a;
                            com.tencent.mm.sdk.platformtools.n3 g17 = mVar.g();
                            android.os.Message obtainMessage = mVar.g().obtainMessage();
                            obtainMessage.what = 1007;
                            obtainMessage.obj = nm5.j.d(string, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                            g17.sendMessage(obtainMessage);
                            return;
                        }
                        return;
                    case -1057016867:
                        if (string2.equals("page_resume")) {
                            if (z17 && (bVar = (i55.b) i55.u.f288889a.b().get(java.lang.Integer.valueOf(i18))) != null) {
                                bVar.c(j17);
                            }
                            e55.m mVar2 = e55.m.f249681a;
                            com.tencent.mm.sdk.platformtools.n3 g18 = mVar2.g();
                            android.os.Message obtainMessage2 = mVar2.g().obtainMessage();
                            obtainMessage2.what = 1000;
                            obtainMessage2.obj = nm5.j.g(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19), string, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
                            g18.sendMessage(obtainMessage2);
                            return;
                        }
                        return;
                    case -793616336:
                        if (string2.equals("app_out")) {
                            e55.m mVar3 = e55.m.f249681a;
                            com.tencent.mm.sdk.platformtools.n3 g19 = mVar3.g();
                            android.os.Message obtainMessage3 = mVar3.g().obtainMessage();
                            obtainMessage3.what = 1008;
                            obtainMessage3.obj = nm5.j.d(string, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                            g19.sendMessage(obtainMessage3);
                            return;
                        }
                        return;
                    case 1626506310:
                        if (string2.equals("page_pause")) {
                            if (z17) {
                                i55.u.f288889a.c(i18, j17);
                            }
                            e55.m mVar4 = e55.m.f249681a;
                            com.tencent.mm.sdk.platformtools.n3 g27 = mVar4.g();
                            android.os.Message obtainMessage4 = mVar4.g().obtainMessage();
                            obtainMessage4.what = 1001;
                            obtainMessage4.obj = nm5.j.g(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19), string, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
                            g27.sendMessage(obtainMessage4);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
