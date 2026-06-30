package uk2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f428521a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.la4 f428522b;

    /* renamed from: c, reason: collision with root package name */
    public final mn0.l0 f428523c;

    public b(java.lang.String anchorUserName, r45.la4 channelParamsDesc, mn0.l0 playInfoData) {
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        kotlin.jvm.internal.o.g(channelParamsDesc, "channelParamsDesc");
        kotlin.jvm.internal.o.g(playInfoData, "playInfoData");
        this.f428521a = anchorUserName;
        this.f428522b = channelParamsDesc;
        this.f428523c = playInfoData;
    }

    public final java.lang.String a() {
        java.lang.String stream_id = this.f428522b.f379274e;
        kotlin.jvm.internal.o.f(stream_id, "stream_id");
        return stream_id;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk2.b)) {
            return false;
        }
        uk2.b bVar = (uk2.b) obj;
        return kotlin.jvm.internal.o.b(this.f428521a, bVar.f428521a) && kotlin.jvm.internal.o.b(this.f428522b, bVar.f428522b) && kotlin.jvm.internal.o.b(this.f428523c, bVar.f428523c);
    }

    public int hashCode() {
        return (((this.f428521a.hashCode() * 31) + this.f428522b.hashCode()) * 31) + this.f428523c.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorUserName: ");
        sb6.append(this.f428521a);
        sb6.append(" desc: ");
        r45.la4 la4Var = this.f428522b;
        kotlin.jvm.internal.o.g(la4Var, "<this>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("stream_id: ");
        sb7.append(la4Var.f379274e);
        sb7.append(" view_desc: ");
        sb7.append(la4Var.f379275f);
        sb7.append(" params: ");
        r45.ka4 channel_params = la4Var.f379273d;
        kotlin.jvm.internal.o.f(channel_params, "channel_params");
        sb7.append("streamId: " + channel_params.f378534e + " quality: " + channel_params.f378541n + " videoWidth: " + channel_params.V + " videoHeight: " + channel_params.W + " support_rotate: " + channel_params.f378548s + '}');
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
