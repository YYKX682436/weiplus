package jp5;

/* loaded from: classes14.dex */
public interface o extends i95.m {
    static /* synthetic */ void R3(jp5.o oVar, android.content.Context context, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchPage");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        oVar.ph(context, z17);
    }

    void A2();

    void Ad(android.app.Activity activity, yz5.l lVar);

    boolean B1();

    boolean Bh();

    void Ee();

    void Gi(java.lang.String str, boolean z17);

    boolean H0();

    void Hd();

    void Hh(int i17);

    void I6(int i17);

    void Jh(java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2);

    void K8();

    void L5(android.content.Context context, int i17, er4.r rVar, long j17, long j18, java.lang.String str, java.util.ArrayList arrayList, boolean z17);

    void M0();

    void N5(boolean z17);

    android.app.Activity P9();

    java.lang.Object Pi(kotlin.coroutines.Continuation continuation);

    void Qb();

    void S5(byte[] bArr, int i17, int i18);

    boolean Sd();

    void Te(boolean z17);

    void W2(int i17);

    void W6(boolean z17);

    void Z4(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding);

    boolean a5();

    void cb();

    void e9(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, er4.b bVar);

    boolean fa(java.lang.String str, boolean z17);

    boolean g3();

    void gf();

    boolean ib();

    boolean ie();

    void j();

    boolean jb(java.lang.String str);

    void je();

    boolean lh();

    void m4(com.tencent.pigeon.voipmp.VoIPMPSelectFileResult voIPMPSelectFileResult, boolean z17, android.app.Activity activity);

    void mc(java.lang.String str, er4.r rVar);

    void mg();

    void n2(int i17);

    void ph(android.content.Context context, boolean z17);

    void reportIDKey(long j17, long j18, long j19);

    void ti();

    void u4(java.lang.String str, java.util.ArrayList arrayList, boolean z17);

    void ug(android.content.res.Configuration configuration);

    void v1();

    void ve(android.content.Context context, yz5.l lVar);

    void we(er4.r rVar);

    java.lang.Object x4(kotlin.coroutines.Continuation continuation);

    void y9();

    void zi(java.lang.String str, boolean z17, int i17, long j17, long j18, long j19, int i18);
}
