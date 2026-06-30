package va3;

/* loaded from: classes15.dex */
public abstract class x0 {
    public static void a(va3.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicorMsg.TrackReport", "report type:%d, code:%d, roomId:%s, isInitiator:%b, roomType:%d, uniqueRoomId:%s, stayDuration:%d, roomDuration:%d, onlineUserCount:%d, isRoomCreate:%b, isRoomDestroy:%b", java.lang.Integer.valueOf(w0Var.f434369a), java.lang.Integer.valueOf(w0Var.f434370b), w0Var.f434371c, java.lang.Boolean.valueOf(w0Var.f434372d), java.lang.Integer.valueOf(w0Var.f434373e), w0Var.f434374f, java.lang.Long.valueOf(w0Var.f434375g), java.lang.Long.valueOf(w0Var.f434376h), java.lang.Integer.valueOf(w0Var.f434377i), java.lang.Boolean.valueOf(w0Var.f434378j), java.lang.Boolean.valueOf(w0Var.f434379k));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36239, java.lang.Integer.valueOf(w0Var.f434369a), java.lang.Integer.valueOf(w0Var.f434370b), w0Var.f434371c, java.lang.Integer.valueOf(w0Var.f434372d ? 1 : 0), java.lang.Integer.valueOf(w0Var.f434373e), w0Var.f434374f, java.lang.Long.valueOf(w0Var.f434375g), java.lang.Long.valueOf(w0Var.f434376h), java.lang.Integer.valueOf(w0Var.f434377i), java.lang.Integer.valueOf(w0Var.f434378j ? 1 : 0), java.lang.Integer.valueOf(w0Var.f434379k ? 1 : 0));
    }
}
