package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class q4 extends android.database.MatrixCursor {

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f192942d;

    public q4(android.os.Bundle bundle) {
        super(new java.lang.String[0], 0);
        this.f192942d = bundle;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.f192942d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        this.f192942d = bundle;
        return bundle;
    }
}
