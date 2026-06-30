package du3;

/* loaded from: classes3.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        int i17 = configProvider.M.getBoolean("is_from_sns_comment", false) ? 97 : configProvider.M.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", -1);
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_enable_scene_list, "", true);
        kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
        return r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null).contains(java.lang.String.valueOf(i17));
    }
}
