package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class gb extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f194983e = {"CREATE TABLE IF NOT EXISTS verifycontact ( id INTEGER PRIMARY KEY, username varchar(40), nickname varchar(40), fullpy varchar(60), shortpy varchar(40), imgflag int, scene int, content text, status int, reserved1 int,reserved2 int,reserved3 text,reserved4 text)", "CREATE UNIQUE INDEX IF NOT EXISTS verifyContactIndex  ON verifycontact ( username )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f194984d;

    public gb(l75.k0 k0Var) {
        this.f194984d = k0Var;
    }
}
