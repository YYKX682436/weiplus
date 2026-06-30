package w33;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f442699a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f442700b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f442701c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f442702d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f442703e;

    /* renamed from: f, reason: collision with root package name */
    public final w33.d f442704f;

    public a(int i17, com.tencent.mm.protobuf.f fVar) {
        this(i17, fVar, false, null, null, null, 60, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.a)) {
            return false;
        }
        w33.a aVar = (w33.a) obj;
        return this.f442699a == aVar.f442699a && kotlin.jvm.internal.o.b(this.f442700b, aVar.f442700b) && this.f442701c == aVar.f442701c && kotlin.jvm.internal.o.b(this.f442702d, aVar.f442702d) && kotlin.jvm.internal.o.b(this.f442703e, aVar.f442703e) && kotlin.jvm.internal.o.b(this.f442704f, aVar.f442704f);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f442699a) * 31;
        com.tencent.mm.protobuf.f fVar = this.f442700b;
        int hashCode2 = (((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f442701c)) * 31;
        java.lang.String str = this.f442702d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.f442703e;
        int hashCode4 = (hashCode3 + (jumpInfo == null ? 0 : jumpInfo.hashCode())) * 31;
        w33.d dVar = this.f442704f;
        return hashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ChatRoomInfo(itemType=" + this.f442699a + ", data=" + this.f442700b + ", isMoreList=" + this.f442701c + ", roomGroupTitle=" + this.f442702d + ", createRoomJumpInfo=" + this.f442703e + ", footerDataWrapper=" + this.f442704f + ')';
    }

    public a(int i17, com.tencent.mm.protobuf.f fVar, boolean z17, java.lang.String str) {
        this(i17, fVar, z17, str, null, null, 48, null);
    }

    public a(int i17, com.tencent.mm.protobuf.f fVar, boolean z17, java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, w33.d dVar) {
        this.f442699a = i17;
        this.f442700b = fVar;
        this.f442701c = z17;
        this.f442702d = str;
        this.f442703e = jumpInfo;
        this.f442704f = dVar;
    }

    public /* synthetic */ a(int i17, com.tencent.mm.protobuf.f fVar, boolean z17, java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, w33.d dVar, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, fVar, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? null : str, (i18 & 16) != 0 ? null : jumpInfo, (i18 & 32) != 0 ? null : dVar);
    }
}
