package com.tencent.mm.plugin.game.commlib.util;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes5.dex */
public class h implements com.tencent.mm.ipcinvoker.j {
    private h() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("action_id");
        if (i17 == 1) {
            ((java.util.HashSet) com.tencent.mm.plugin.game.commlib.util.i.f139411c).add(bundle.getString("action_param"));
        } else {
            if (i17 != 2) {
                return;
            }
            ((java.util.HashSet) com.tencent.mm.plugin.game.commlib.util.i.f139411c).remove(bundle.getString("action_param"));
        }
    }
}
