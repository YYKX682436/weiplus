package y33;

/* loaded from: classes15.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f459176e = {l75.n0.getCreateSQLs(y33.e.W, "GameChatRoomContact")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f459177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 storage) {
        super(storage, y33.e.W, "GameChatRoomContact", dm.i5.f237571z);
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f459177d = storage;
    }

    public final u33.h y0(java.lang.String userName) {
        y33.e eVar;
        kotlin.jvm.internal.o.g(userName, "userName");
        android.database.Cursor f17 = this.f459177d.f("SELECT * FROM GameChatRoomContact WHERE userName = " + d95.b0.O(userName), null, 2);
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            eVar = new y33.e();
            eVar.convertFrom(f17);
        } else {
            eVar = null;
        }
        vz5.b.a(f17, null);
        return eVar;
    }

    public final boolean z0(y33.e contact) {
        int p17;
        kotlin.jvm.internal.o.g(contact, "contact");
        if (contact.field_userName == null) {
            return false;
        }
        contact.field_updateTime = c01.id.c();
        java.lang.String str = contact.field_userName;
        kotlin.jvm.internal.o.f(str, "getUserName(...)");
        u33.h y07 = y0(str);
        l75.k0 k0Var = this.f459177d;
        if (y07 == null) {
            p17 = (int) k0Var.l("GameChatRoomContact", "userName", contact.convertTo());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertContact[");
            sb6.append(p17);
            sb6.append("] ");
            sb6.append("userName: " + contact.field_userName + "; roomName: " + contact.field_roomName);
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomContactStorage", sb6.toString());
            if (p17 > 0) {
                doNotify("single", 2, contact.field_userName);
            }
        } else {
            android.content.ContentValues convertTo = contact.convertTo();
            java.lang.String str2 = contact.field_userName;
            kotlin.jvm.internal.o.f(str2, "getUserName(...)");
            p17 = k0Var.p("GameChatRoomContact", convertTo, "userName=?", new java.lang.String[]{str2});
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateContact[");
            sb7.append(p17);
            sb7.append("] ");
            sb7.append("userName: " + contact.field_userName + "; roomName: " + contact.field_roomName);
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomContactStorage", sb7.toString());
            if (p17 > 0) {
                doNotify("single", 3, contact.field_userName);
            }
        }
        return p17 > 0;
    }
}
