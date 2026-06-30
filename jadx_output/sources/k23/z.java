package k23;

/* loaded from: classes12.dex */
public final class z {
    public z(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, k23.v2 v2Var, int i17, int i18, k23.w0 voiceScene, java.lang.String title, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(voiceScene, "voiceScene");
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138205g = v2Var;
        com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138207i = i17;
        com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138208m = i18;
        com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138209n = voiceScene;
        com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138210o = title;
        if (z17) {
            com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138211p = k23.u2.f303702e;
        } else {
            com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138211p = k23.u2.f303701d;
        }
        try {
            androidx.lifecycle.o a17 = bm5.a1.a(context);
            final k23.y yVar = new k23.y(this);
            a17.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.util.LifecycleExtKt$onDestroy$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    yz5.a.this.invoke();
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTSFloatingVoiceHalfScreenActivity", e17, "", new java.lang.Object[0]);
        }
        bh5.c cVar = new bh5.c();
        cVar.d(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.class));
        cVar.f20922a.f20924a = context;
        cVar.a(com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.class.getName());
        cVar.b(com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceMMHalfScreenDialogFragment.class);
        cVar.e(true);
        cVar.c(true);
        cVar.g();
    }
}
