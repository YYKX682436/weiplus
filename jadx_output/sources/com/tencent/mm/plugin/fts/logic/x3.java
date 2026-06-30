package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class x3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final p13.u f137737n;

    public x3(com.tencent.mm.plugin.fts.logic.c4 c4Var, p13.u uVar) {
        this.f137737n = uVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "FTS5DBInfoTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.vfs.z7 z7Var;
        long j17;
        long j18;
        long j19;
        com.tencent.mm.vfs.x1 m17;
        o13.o oVar = o13.p.f342249b;
        gm0.j1.i();
        java.lang.String h17 = gm0.j1.u().h();
        com.tencent.mm.vfs.z7 a17 = h17 == null ? null : com.tencent.mm.vfs.z7.a(h17);
        if (a17 == null) {
            z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("FTS5IndexMicroMsg_encrypt.db", false, false), null, null);
        } else {
            z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, com.tencent.mm.vfs.e8.l(a17.f213279f + "/FTS5IndexMicroMsg_encrypt.db", false, false), a17.f213280g, a17.f213281h);
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
        oVar.f342243a = ((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L) / 1048576;
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.o(java.lang.String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", "FTS5MetaContact", 131072, 1), null);
        try {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (cursorWrapper.moveToNext()) {
                j17 = cursorWrapper.getLong(0);
                ((com.tencent.mm.plugin.fts.e) o17).close();
            } else {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                j17 = 0;
            }
            oVar.f342244b = j17;
            o17 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.o(java.lang.String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", "FTS5MetaContact", 131075, 38), null);
            try {
                android.database.CursorWrapper cursorWrapper2 = (android.database.CursorWrapper) o17;
                if (cursorWrapper2.moveToNext()) {
                    j18 = cursorWrapper2.getLong(0);
                } else {
                    ((com.tencent.mm.plugin.fts.e) o17).close();
                    j18 = 0;
                }
                oVar.f342245c = j18;
                o17 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.o(java.lang.String.format("SELECT count(docid) FROM %s WHERE subtype = %d", "FTS5MetaFavorite", 9), null);
                try {
                    android.database.CursorWrapper cursorWrapper3 = (android.database.CursorWrapper) o17;
                    if (cursorWrapper3.moveToNext()) {
                        j19 = cursorWrapper3.getLong(0);
                    } else {
                        ((com.tencent.mm.plugin.fts.e) o17).close();
                        j19 = 0;
                    }
                    oVar.f342247e = j19;
                    o17 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.o(java.lang.String.format("SELECT count(docid) FROM %s", "FTS5MetaMessage"), null);
                    try {
                        android.database.CursorWrapper cursorWrapper4 = (android.database.CursorWrapper) o17;
                        long j27 = cursorWrapper4.moveToNext() ? cursorWrapper4.getLong(0) : 0L;
                        ((com.tencent.mm.plugin.fts.e) o17).close();
                        oVar.f342246d = j27;
                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.q(-301L, oVar.f342244b);
                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.q(-302L, oVar.f342245c);
                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.q(-303L, oVar.f342247e);
                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f.q(-304L, oVar.f342246d);
                        p13.v vVar = new p13.v(this.f137737n);
                        if (this.f137737n.f351151m != null) {
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.logic.w3(this, vVar));
                        }
                        return true;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
