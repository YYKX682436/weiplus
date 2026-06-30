package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class AchievementInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.AchievementInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.AchievementInfo();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement> game_achievements = new java.util.LinkedList<>();

    /* loaded from: classes4.dex */
    public static class GameAchievement extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement();
        public java.lang.String game_name = "";
        public java.lang.String game_icon = "";
        public java.lang.String title_icon = "";
        public java.lang.String description = "";
        public java.lang.String title_icon_hd = "";

        public static com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement create() {
            return new com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement();
        }

        public static com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement newBuilder() {
            return new com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement();
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement gameAchievement = (com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement) fVar;
            return n51.f.a(this.game_name, gameAchievement.game_name) && n51.f.a(this.game_icon, gameAchievement.game_icon) && n51.f.a(this.title_icon, gameAchievement.title_icon) && n51.f.a(this.description, gameAchievement.description) && n51.f.a(this.title_icon_hd, gameAchievement.title_icon_hd);
        }

        public java.lang.String getDescription() {
            return this.description;
        }

        public java.lang.String getGameIcon() {
            return this.game_icon;
        }

        public java.lang.String getGameName() {
            return this.game_name;
        }

        public java.lang.String getGame_icon() {
            return this.game_icon;
        }

        public java.lang.String getGame_name() {
            return this.game_name;
        }

        public java.lang.String getTitleIcon() {
            return this.title_icon;
        }

        public java.lang.String getTitleIconHd() {
            return this.title_icon_hd;
        }

        public java.lang.String getTitle_icon() {
            return this.title_icon;
        }

        public java.lang.String getTitle_icon_hd() {
            return this.title_icon_hd;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.game_name;
                if (str != null) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.game_icon;
                if (str2 != null) {
                    fVar.j(2, str2);
                }
                java.lang.String str3 = this.title_icon;
                if (str3 != null) {
                    fVar.j(3, str3);
                }
                java.lang.String str4 = this.description;
                if (str4 != null) {
                    fVar.j(4, str4);
                }
                java.lang.String str5 = this.title_icon_hd;
                if (str5 != null) {
                    fVar.j(5, str5);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str6 = this.game_name;
                int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
                java.lang.String str7 = this.game_icon;
                if (str7 != null) {
                    j17 += b36.f.j(2, str7);
                }
                java.lang.String str8 = this.title_icon;
                if (str8 != null) {
                    j17 += b36.f.j(3, str8);
                }
                java.lang.String str9 = this.description;
                if (str9 != null) {
                    j17 += b36.f.j(4, str9);
                }
                java.lang.String str10 = this.title_icon_hd;
                return str10 != null ? j17 + b36.f.j(5, str10) : j17;
            }
            if (i17 == 2) {
                c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
            int intValue = ((java.lang.Integer) objArr[2]).intValue();
            if (intValue == 1) {
                this.game_name = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 2) {
                this.game_icon = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.title_icon = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                this.description = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.title_icon_hd = aVar2.k(intValue);
            return 0;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setDescription(java.lang.String str) {
            this.description = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setGameIcon(java.lang.String str) {
            this.game_icon = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setGameName(java.lang.String str) {
            this.game_name = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setGame_icon(java.lang.String str) {
            this.game_icon = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setGame_name(java.lang.String str) {
            this.game_name = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setTitleIcon(java.lang.String str) {
            this.title_icon = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setTitleIconHd(java.lang.String str) {
            this.title_icon_hd = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setTitle_icon(java.lang.String str) {
            this.title_icon = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement setTitle_icon_hd(java.lang.String str) {
            this.title_icon_hd = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.AchievementInfo create() {
        return new com.tencent.wechat.aff.newlife.AchievementInfo();
    }

    public static com.tencent.wechat.aff.newlife.AchievementInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.AchievementInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.AchievementInfo();
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo addAllElementGameAchievements(java.util.Collection<com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement> collection) {
        this.game_achievements.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo addAllElementGame_achievements(java.util.Collection<com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement> collection) {
        this.game_achievements.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo addElementGameAchievements(com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement gameAchievement) {
        this.game_achievements.add(gameAchievement);
        return this;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo addElementGame_achievements(com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement gameAchievement) {
        this.game_achievements.add(gameAchievement);
        return this;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.AchievementInfo) && n51.f.a(this.game_achievements, ((com.tencent.wechat.aff.newlife.AchievementInfo) fVar).game_achievements);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement> getGameAchievements() {
        return this.game_achievements;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement> getGame_achievements() {
        return this.game_achievements;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.AchievementInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.game_achievements);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.game_achievements) + 0;
        }
        if (i17 == 2) {
            this.game_achievements.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement gameAchievement = new com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement();
            if (bArr != null && bArr.length > 0) {
                gameAchievement.parseFrom(bArr);
            }
            this.game_achievements.add(gameAchievement);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo setGameAchievements(java.util.LinkedList<com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement> linkedList) {
        this.game_achievements = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo setGame_achievements(java.util.LinkedList<com.tencent.wechat.aff.newlife.AchievementInfo.GameAchievement> linkedList) {
        this.game_achievements = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.AchievementInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.AchievementInfo) super.parseFrom(bArr);
    }
}
