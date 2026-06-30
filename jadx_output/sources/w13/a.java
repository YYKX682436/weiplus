package w13;

/* loaded from: classes12.dex */
public final class a extends o13.a {
    @Override // o13.a
    public boolean C() {
        return !i(-110, 3);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).q(-110L, 3L);
        }
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5ChatroomMemberStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return 5;
    }

    @Override // o13.u
    public int getType() {
        return 5;
    }

    @Override // o13.a
    public java.lang.String n() {
        java.lang.String format = java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", java.util.Arrays.copyOf(new java.lang.Object[]{r()}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5ChatroomMemberStorage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "ChatroomMember";
    }
}
