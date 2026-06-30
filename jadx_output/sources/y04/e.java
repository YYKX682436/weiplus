package y04;

@j95.b
/* loaded from: classes11.dex */
public class e extends i95.w implements vg3.j4 {
    public void Ai(java.lang.String str, long j17, java.lang.String str2) {
        c14.a aVar = new c14.a();
        aVar.field_historyId = str;
        aVar.field_msgId = j17;
        aVar.field_talker = str2;
        boolean insert = ((x04.e) i95.n0.c(x04.e.class)).wi().insert(aVar);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(j17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = java.lang.Boolean.valueOf(insert);
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SelectRecordService", "saveHistoryIdToMsgIf msgId:%s historyId:%s result:%s", objArr);
    }

    public void wi(int i17) {
        a14.a.a().f588g = i17;
        a14.a a17 = a14.a.a();
        long j17 = a17.f583b;
        com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct shareRoomHistoryStatStruct = a17.f582a;
        shareRoomHistoryStatStruct.f60365l = j17;
        shareRoomHistoryStatStruct.f60366m = a17.f584c;
        long j18 = 0;
        shareRoomHistoryStatStruct.f60367n = j18;
        shareRoomHistoryStatStruct.f60368o = j18;
        shareRoomHistoryStatStruct.f60369p = j18;
        shareRoomHistoryStatStruct.f60370q = a17.f585d;
        shareRoomHistoryStatStruct.f60371r = a17.f586e;
        shareRoomHistoryStatStruct.f60374u = a17.f588g;
        shareRoomHistoryStatStruct.f60375v = a17.f589h;
        shareRoomHistoryStatStruct.f60377x = a17.f593l;
        shareRoomHistoryStatStruct.f60378y = a17.f594m;
        shareRoomHistoryStatStruct.A = a17.f590i;
        shareRoomHistoryStatStruct.B = a17.f591j;
        shareRoomHistoryStatStruct.C = a17.f592k;
        shareRoomHistoryStatStruct.n();
        shareRoomHistoryStatStruct.k();
    }
}
