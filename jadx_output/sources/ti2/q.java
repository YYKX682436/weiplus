package ti2;

/* loaded from: classes10.dex */
public final class q extends ti2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gk2.e buContext, si2.c callback) {
        super(buContext, callback);
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // ti2.o, in5.r
    public int e() {
        return com.tencent.mm.R.layout.dkl;
    }

    @Override // ti2.o
    public java.lang.String n() {
        return "VoiceRoomUserConvert";
    }

    @Override // ti2.o
    public void o(android.widget.TextView descTv, km2.q data, boolean z17) {
        kotlin.jvm.internal.o.g(descTv, "descTv");
        kotlin.jvm.internal.o.g(data, "data");
        gk2.e eVar = this.f419574e;
        if (!((mm2.e1) eVar.a(mm2.e1.class)).c7()) {
            descTv.setVisibility(8);
            return;
        }
        descTv.setVisibility(0);
        if (data.f309192w == 0) {
            descTv.setText(descTv.getContext().getResources().getString(com.tencent.mm.R.string.lza));
            com.tencent.mars.xlog.Log.i(this.f419576g, "desc gone, position = 0, userIs = " + data);
            return;
        }
        java.lang.String R6 = ((mm2.y2) eVar.a(mm2.y2.class)).R6(data.f309192w);
        if (z17) {
            descTv.setText(descTv.getContext().getResources().getString(com.tencent.mm.R.string.lz_, R6));
        } else {
            descTv.setText(descTv.getContext().getResources().getString(com.tencent.mm.R.string.lze, R6));
        }
    }
}
