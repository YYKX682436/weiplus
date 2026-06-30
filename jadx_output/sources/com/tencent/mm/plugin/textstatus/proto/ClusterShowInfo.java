package com.tencent.mm.plugin.textstatus.proto;

/* loaded from: classes8.dex */
public class ClusterShowInfo extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<pj4.g0> iconActions = new java.util.LinkedList<>();
    public java.lang.String iconId;
    public java.lang.String sourceActivityId;
    public java.lang.String sourceIcon;
    public java.lang.String sourceId;
    public java.lang.String sourceName;
    public java.lang.String topic;

    public static final com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo create() {
        return new com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo)) {
            return false;
        }
        com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo clusterShowInfo = (com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo) fVar;
        return n51.f.a(this.sourceName, clusterShowInfo.sourceName) && n51.f.a(this.sourceIcon, clusterShowInfo.sourceIcon) && n51.f.a(this.iconId, clusterShowInfo.iconId) && n51.f.a(this.topic, clusterShowInfo.topic) && n51.f.a(this.sourceId, clusterShowInfo.sourceId) && n51.f.a(this.sourceActivityId, clusterShowInfo.sourceActivityId) && n51.f.a(this.iconActions, clusterShowInfo.iconActions);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.sourceName;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.sourceIcon;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.iconId;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.topic;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.sourceId;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.sourceActivityId;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.g(8, 8, this.iconActions);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.sourceName;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.sourceIcon;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.iconId;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.topic;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.sourceId;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.sourceActivityId;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.g(8, 8, this.iconActions);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.iconActions.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo clusterShowInfo = (com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                clusterShowInfo.sourceName = aVar2.k(intValue);
                return 0;
            case 2:
                clusterShowInfo.sourceIcon = aVar2.k(intValue);
                return 0;
            case 3:
                clusterShowInfo.iconId = aVar2.k(intValue);
                return 0;
            case 4:
                clusterShowInfo.topic = aVar2.k(intValue);
                return 0;
            case 5:
                clusterShowInfo.sourceId = aVar2.k(intValue);
                return 0;
            case 6:
                clusterShowInfo.sourceActivityId = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    pj4.g0 g0Var = new pj4.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var.parseFrom(bArr2);
                    }
                    clusterShowInfo.iconActions.add(g0Var);
                }
                return 0;
        }
    }

    public com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo setIconActions(java.util.LinkedList<pj4.g0> linkedList) {
        this.iconActions = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo setIconId(java.lang.String str) {
        this.iconId = str;
        return this;
    }

    public com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo setSourceActivityId(java.lang.String str) {
        this.sourceActivityId = str;
        return this;
    }

    public com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo setSourceIcon(java.lang.String str) {
        this.sourceIcon = str;
        return this;
    }

    public com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo setSourceId(java.lang.String str) {
        this.sourceId = str;
        return this;
    }

    public com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo setSourceName(java.lang.String str) {
        this.sourceName = str;
        return this;
    }

    public com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo setTopic(java.lang.String str) {
        this.topic = str;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.sourceName;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "sourceName", str, false);
            eVar.d(jSONObject, "sourceIcon", this.sourceIcon, false);
            eVar.d(jSONObject, "iconId", this.iconId, false);
            eVar.d(jSONObject, "topic", this.topic, false);
            eVar.d(jSONObject, "sourceId", this.sourceId, false);
            eVar.d(jSONObject, "sourceActivityId", this.sourceActivityId, false);
            eVar.d(jSONObject, "iconActions", this.iconActions, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
