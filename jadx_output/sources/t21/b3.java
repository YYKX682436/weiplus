package t21;

/* loaded from: classes11.dex */
public abstract class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f414706a = new java.util.ArrayList(3);

    static {
        kk.l lVar = t21.w2.f415056c;
        e("", "videoinfo2", new java.lang.String[]{"CREATE TABLE IF NOT EXISTS videoinfo2 ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int, forward_msg_local_id int,msg_uuid text,share_app_info text, origin_file_name text, had_clicked_video int, media_id text, media_flag text, video_path text, media_cdnid text, video_wxa_info BLOB, weapp_source_username text, msg_talker text forward_msg_talker text) ", "CREATE INDEX IF NOT EXISTS  video_status_index ON videoinfo2 ( status,downloadtime )", "CREATE TABLE IF NOT EXISTS videoinfo ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int, forward_msg_local_id int, msg_uuid text, share_app_info text, origin_file_name text, had_clicked_video int)", "alter table videoinfo2 add videofuncflag int ;", "alter table videoinfo2 add masssendid long default 0;", "alter table videoinfo2 add masssendlist text ;", "alter table videoinfo2 add videomd5 text ;", "alter table videoinfo2 add streamvideo byte[] ;", "alter table videoinfo2 add statextstr text ;", "alter table videoinfo2 add downloadscene int ;", "alter table videoinfo2 add mmsightextinfo byte[] ;", "alter table videoinfo2 add preloadsize int ;", "alter table videoinfo2 add videoformat int ;", "alter table videoinfo2 add forward_msg_local_id int ;", "alter table videoinfo2 add msg_uuid text ;", "alter table videoinfo2 add share_app_info text ;", "alter table videoinfo2 add origin_file_name text ;", "alter table videoinfo2 add had_clicked_video int ;", "alter table videoinfo2 add media_id text ;", "alter table videoinfo2 add media_flag text ;", "alter table videoinfo2 add video_path text ;", "alter table videoinfo2 add media_cdnid text ;", "alter table videoinfo2 add video_wxa_info BLOB ;", "alter table videoinfo2 add weapp_source_username text ;", "alter table videoinfo2 add msg_talker text ;", "alter table videoinfo2 add forward_msg_talker text ;", "alter table videoinfo add videofuncflag int ;", "alter table videoinfo add masssendid long default 0;", "alter table videoinfo add masssendlist text ;", "alter table videoinfo add videomd5 text ;", "alter table videoinfo add streamvideo byte[] ;", "alter table videoinfo add statextstr text ;", "alter table videoinfo add downloadscene int ;", "alter table videoinfo add mmsightextinfo byte[] ;", "alter table videoinfo add preloadsize int ;", "alter table videoinfo add videoformat int ;", "alter table videoinfo add forward_msg_local_id int ;", "alter table videoinfo add msg_uuid text ;", "alter table videoinfo add share_app_info text ;", "alter table videoinfo add origin_file_name text ;", "alter table videoinfo add had_clicked_video int ;", "alter table videoinfo add media_id text ;", "alter table videoinfo add media_flag text ;", "alter table videoinfo add video_path text ;", "alter table videoinfo add media_cdnid text ;", "alter table videoinfo add video_wxa_info BLOB ;", "alter table videoinfo add weapp_source_username text ;", "alter table videoinfo add msg_talker text ;", "alter table videoinfo add forward_msg_talker text ;", "CREATE INDEX IF NOT EXISTS  videoinfo_MediaIdIndex ON videoinfo ( media_id  )", "CREATE INDEX IF NOT EXISTS  videoinfo2_MediaIdIndex ON videoinfo2 ( media_id  )", "insert into videoinfo2 select * from videoinfo ;", "delete from videoinfo ;", "CREATE INDEX IF NOT EXISTS  massSendIdIndex ON videoinfo2 ( masssendid )", "CREATE INDEX IF NOT EXISTS  LastModifyTimeIndex ON videoinfo2 ( lastmodifytime )", "CREATE TABLE IF NOT EXISTS  VideoHash  (size int , CreateTime long, hash text ,  cdnxml text, orgpath text);", "CREATE INDEX IF NOT EXISTS  VideoHashTimeIndex ON VideoHash ( CreateTime  )", "CREATE INDEX IF NOT EXISTS  VideoHashSizeIndex ON VideoHash ( size  )"});
        e("findermsg", "findervideoinfo", t21.w2.a("findervideoinfo"));
        e("statussquaremsg", "textstatusvideoinfo", t21.w2.a("textstatusvideoinfo"));
        e("gamelifesess", "gamelifevideoinfo", t21.w2.a("gamelifevideoinfo"));
        e("bizfansmsg", "bizfansvideoinfo", t21.w2.a("bizfansvideoinfo"));
        e("picfansmsg", "bizphotofansvideoinfo", t21.w2.a("bizphotofansvideoinfo"));
        e("zhugemsg", "zhugemsgvideoinfo", t21.w2.a("zhugemsgvideoinfo"));
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoInfoStorage", "[getTable] fileName is null. %s", new com.tencent.mm.sdk.platformtools.z3());
            return "videoinfo2";
        }
        java.util.Iterator it = f414706a.iterator();
        while (it.hasNext()) {
            t21.a3 a3Var = (t21.a3) it.next();
            if (!a3Var.f414702b.isEmpty() && str.toLowerCase().endsWith(a3Var.f414702b)) {
                return a3Var.f414701a;
            }
        }
        return "videoinfo2";
    }

    public static java.lang.String b(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String Q0 = f9Var.Q0();
        if (f9Var.A0() == 0) {
            java.lang.String j17 = f9Var.j();
            if (j17.endsWith("\n")) {
                j17 = j17.substring(0, j17.length() - 1);
            }
            java.lang.String[] split = j17.split(":");
            try {
                Q0 = split.length > 0 ? split[0] : null;
                if (split.length > 1) {
                    com.tencent.mm.sdk.platformtools.t8.V(split[1], 0L);
                }
                if (split.length > 2) {
                    split[2].equals("1");
                }
            } catch (java.lang.Exception unused) {
                if (Q0 == null) {
                    Q0 = "";
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoContent", "VoiceContent parse failed.");
            }
        }
        if (Q0 != null) {
            return d(Q0);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoInfoStorage", "[getTable] human is null. %s", new com.tencent.mm.sdk.platformtools.z3());
        return "videoinfo2";
    }

    public static java.lang.String c(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return d(str);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoInfoStorage", "[getTableByTalker] talker is null. %s", new com.tencent.mm.sdk.platformtools.z3());
        return "videoinfo2";
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.storage.z3.E3(str)) {
            return "bizfansvideoinfo";
        }
        if (com.tencent.mm.storage.z3.H4(str)) {
            return "textstatusvideoinfo";
        }
        if (com.tencent.mm.storage.z3.a4(str)) {
            return "gamelifevideoinfo";
        }
        if (com.tencent.mm.storage.z3.V3(str)) {
            return "findervideoinfo";
        }
        return str != null && str.endsWith("@zhugemsg") ? "zhugemsgvideoinfo" : com.tencent.mm.storage.z3.G3(str) ? "bizphotofansvideoinfo" : "videoinfo2";
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        f414706a.add(new t21.a3(str.toLowerCase(), str2, strArr));
    }
}
