package gv4;

/* loaded from: classes16.dex */
public abstract class b {
    public static void a(android.view.View view, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.WCTopicSessionInputStruct wCTopicSessionInputStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSessionInputStruct();
        wCTopicSessionInputStruct.f62194d = i17;
        wCTopicSessionInputStruct.f62195e = wCTopicSessionInputStruct.b("EnterSceneId", str, true);
        wCTopicSessionInputStruct.f62196f = wCTopicSessionInputStruct.b("RequestId", str2, true);
        wCTopicSessionInputStruct.f62197g = i18;
        wCTopicSessionInputStruct.f62198h = wCTopicSessionInputStruct.b("QueryKey", str3, true);
        wCTopicSessionInputStruct.f62199i = wCTopicSessionInputStruct.b("SessionId", str4, true);
        wCTopicSessionInputStruct.f62200j = i19;
        wCTopicSessionInputStruct.f62201k = j17;
        wCTopicSessionInputStruct.k();
        su4.k3.m(wCTopicSessionInputStruct);
    }
}
